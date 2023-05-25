package may_25_2023;


import java.util.*;
import java.util.concurrent.*;

class DataProcessor implements Runnable, Comparable<DataProcessor> {
    private String data;
    private int priority;

    public DataProcessor(String data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Processing data: " + data);
        // Perform data processing operations here

        System.out.println("Data processing complete: " + data);
    }

    @Override
    public int compareTo(DataProcessor other) {
        // Higher priority tasks will have lower values for compareTo
        return Integer.compare(other.priority, this.priority);
    }
}

public class DataProcessingApplication {
    public static void main(String[] args) {
        // Simulated data from multiple sources
        List<String> inputData = new ArrayList<>();
        inputData.add("Data 1 (High Priority)");
        inputData.add("Data 2 (Low Priority)");
        inputData.add("Data 3 (High Priority)");
        inputData.add("Data 4 (Medium Priority)");

        // Create a priority blocking queue to hold the data processors
        PriorityBlockingQueue<DataProcessor> queue = new PriorityBlockingQueue<>();

        // Populate the queue with data processors based on input data
        for (String data : inputData) {
            int priority = determinePriority(data); // Determine priority based on data
            DataProcessor dataProcessor = new DataProcessor(data, priority);
            queue.offer(dataProcessor);
        }

        // Create a thread pool with a fixed number of threads
        int numThreads = 4;
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        // Process data in parallel
        while (!queue.isEmpty()) {
            DataProcessor dataProcessor = queue.poll();
            executorService.execute(dataProcessor);
        }

        // Shut down the thread pool
        executorService.shutdown();
    }

    private static int determinePriority(String data) {
        // Logic to determine priority based on data
        if (data.contains("High Priority")) {
            return 1;
        } else if (data.contains("Medium Priority")) {
            return 2;
        } else {
            return 3;
        }
    }
}
