import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bus {
    private String busNumber;
    private int totalSeats;
    private int availableSeats;

    public Bus(String busNumber, int totalSeats, int availableSeats) {
        this.busNumber = busNumber;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Seat booked successfully!");
        } else {
            System.out.println("No available seats on this bus.");
        }
    }
}

class BusBookingSystem {
    private List<Bus> buses;

    public BusBookingSystem() {
        buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void displayAvailableBuses() {
        System.out.println("Available Buses:");
        for (Bus bus : buses) {
            System.out.println("Bus Number: " + bus.getBusNumber() +
                               ", Available Seats: " + bus.getAvailableSeats());
        }
    }

    public Bus findBus(String busNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNumber().equals(busNumber)) {
                return bus;
            }
        }
        return null;
    }
}

public class BusBook {
    public static void main(String[] args) {
        BusBookingSystem bookingSystem = new BusBookingSystem();

        // Adding sample buses
        bookingSystem.addBus(new Bus("A123", 50, 50));
        bookingSystem.addBus(new Bus("B456", 40, 10));
        bookingSystem.addBus(new Bus("C789", 30, 0));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display available buses");
            System.out.println("2. Book a seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookingSystem.displayAvailableBuses();
                    break;
                case 2:
                    System.out.print("Enter bus number: ");
                    String busNumber = scanner.next();
                    Bus bus = bookingSystem.findBus(busNumber);
                    if (bus != null) {
                        bus.bookSeat();
                    } else {
                        System.out.println("Invalid bus number.");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the bus booking system!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
