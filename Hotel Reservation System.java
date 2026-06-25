import java.util.Scanner;
import java.util.ArrayList;

class ReservationSystem {
    private String customerName;
    private int roomNumber;

    public ReservationSystem(String customerName, int roomNumber) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}

class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ReservationSystem> reservations = new ArrayList<>();
        
        int choice;
        do {
            System.out.println("Hotel Reservation System");
            System.out.println("1. Make Reservation");
            System.out.println("2. View Reservations");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter room number: ");
                    int roomNumber = sc.nextInt();
                    reservations.add(new ReservationSystem(name, roomNumber));
                    System.out.println("Reservation made successfully!");
                    break;

                case 2:
                    if (reservations.isEmpty()) {
                        System.out.println("No reservations found.");
                    } else {
                        System.out.println("\nReservations:");
                        for (ReservationSystem reservation : reservations) {
                            System.out.println("Customer Name: " + reservation.getCustomerName() + ", Room Number: " + reservation.getRoomNumber());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter room number to cancel reservation: ");
                    int cancelRoomNumber = sc.nextInt();
                    boolean found = false;
                    for (ReservationSystem reservation : reservations) {
                        if (reservation.getRoomNumber() == cancelRoomNumber) {
                            reservations.remove(reservation);
                            System.out.println("Reservation cancelled successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Reservation not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}