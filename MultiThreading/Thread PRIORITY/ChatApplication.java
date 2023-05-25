package may_25_2023;

/*
 * Build a program that simulates a real-time chat 
 * application using multiple threads. Use thread 
 * synchronization to ensure that each user's 
 * messages are sent and received in the correct 
 * order, and use thread pooling to manage the 
 * threads and ensure that the application scales 
 * well as the number of users increases.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ChatMessage {
    private User sender;
    private String message;

    public ChatMessage(User sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}

class ChatRoom {
    private StringBuilder chatHistory = new StringBuilder();

    public synchronized void sendMessage(ChatMessage message) {
        User sender = message.getSender();
        String messageContent = message.getMessage();

        chatHistory.append(sender.getName()).append(": ").append(messageContent).append("\n");

        System.out.println("Message sent by " + sender.getName() + ": " + messageContent);
    }

    public synchronized String getChatHistory() {
        return chatHistory.toString();
    }
}

class ChatClient implements Runnable {
    private User user;
    private ChatRoom chatRoom;

    public ChatClient(User user, ChatRoom chatRoom) {
        this.user = user;
        this.chatRoom = chatRoom;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            String message = "Message " + i + " from " + user.getName();
            ChatMessage chatMessage = new ChatMessage(user, message);
            chatRoom.sendMessage(chatMessage);
        }
    }
}

public class ChatApplication {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Create multiple users and start their chat client threads
        User user1 = new User("Jaga");
        User user2 = new User("Kalia");
        User user3 = new User("Manoj");
        User user4 = new User("Manas");
        User user5 = new User("Depak");

        executorService.execute(new ChatClient(user1, chatRoom));
        executorService.execute(new ChatClient(user2, chatRoom));
        executorService.execute(new ChatClient(user3, chatRoom));
        executorService.execute(new ChatClient(user4, chatRoom));
        executorService.execute(new ChatClient(user5, chatRoom));

        // Shutdown the thread pool
        executorService.shutdown();

        // Wait for all threads to finish their execution
        while (!executorService.isTerminated()) {
            // Do nothing, just wait
        }

        // Display the chat history
        System.out.println("Chat History:\n" + chatRoom.getChatHistory());
    }
}

