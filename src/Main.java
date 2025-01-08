class Flight {
    private final String flightNumber;
    private final String destination;
    private final int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public void bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;
            System.out.println("Seat booked successfully.");
        } else {
            System.out.println("Flight fully booked.");
        }
    }

    public void displayInfo() {
        System.out.println("Flight Number: " + flightNumber + ", Destination: " + destination + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats);
    }
}

class Passenger {
    private final String name;
    private final int age;
    private final String passportNumber;

    public Passenger(String name, int age, String passportNumber) {
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    public void displayInfo() {
        System.out.println("Passenger Name: " + name + ", Age: " + age + ", Passport Number: " + passportNumber);
    }
}

class Reservation {
    private final Flight flight;
    private final Passenger passenger;
    private final String reservationID;

    public Reservation(Flight flight, Passenger passenger, String reservationID) {
        this.flight = flight;
        this.passenger = passenger;
        this.reservationID = reservationID;
        flight.bookSeat();
    }

    public void displayInfo() {
        System.out.println("Reservation ID: " + reservationID);
        flight.displayInfo();
        passenger.displayInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("FL123", "New York", 150);
        Flight flight2 = new Flight("FL456", "Los Angeles", 200);

        Passenger passenger1 = new Passenger("Alice", 30, "P12345");
        Passenger passenger2 = new Passenger("Bob", 40, "P67890");

        Reservation res1 = new Reservation(flight1, passenger1, "R001");
        Reservation res2 = new Reservation(flight2, passenger2, "R002");

        res1.displayInfo();
        res2.displayInfo();

        System.out.println("Are flights the same? " + flight1.equals(flight2));
    }
}
