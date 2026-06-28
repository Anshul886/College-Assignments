import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Main Class to run the desired system
public class day28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select System to Run:");
        System.out.println("1. Library Management System (Q110)");
        System.out.println("2. Bank Account System (Q111)");
        System.out.println("3. Ticket Booking System (Q112)");
        System.out.println("4. Contact Management System");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: LibrarySystem.run(); break;
            case 2: BankSystem.run(); break;
            case 3: TicketSystem.run(); break;
            case 4: ContactSystem.run(); break;
            default: System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}

// ==========================================
// Q110: LIBRARY MANAGEMENT SYSTEM
// ==========================================
class LibrarySystem {
    static ArrayList<String> books = new ArrayList<>();

    public static void run() {
        Scanner sc = new Scanner(System.in);
        // Pre-populating some books
        books.add("Java Programming");
        books.add("Data Structures");

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. View Books\n2. Add Book\n3. Borrow Book\n4. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.println("Books available: " + books);
            } else if (choice == 2) {
                System.out.print("Enter book title: ");
                books.add(sc.nextLine());
                System.out.println("Book added successfully!");
            } else if (choice == 3) {
                System.out.print("Enter book to borrow: ");
                String title = sc.nextLine();
                if (books.remove(title)) {
                    System.out.println("You have borrowed: " + title);
                } else {
                    System.out.println("Book not found!");
                }
            } else {
                break;
            }
        }
    }
}

// ==========================================
// Q111: BANK ACCOUNT SYSTEM
// ==========================================
class BankSystem {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Account Holder Name: ");
        sc.nextLine(); // clear buffer
        String name = sc.nextLine();
        double balance = 500.0; // Initial deposit

        while (true) {
            System.out.println("\n--- Bank Account System (" + name + ") ---");
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Current Balance: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                balance += amount;
                System.out.println("Deposited successfully. New Balance: $" + balance);
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn successfully. Remaining Balance: $" + balance);
                } else {
                    System.out.println("Insufficient funds!");
                }
            } else {
                break;
            }
        }
    }
}

// ==========================================
// Q112: TICKET BOOKING SYSTEM
// ==========================================
class TicketSystem {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10]; // 10 available seats (false = empty, true = booked)

        while (true) {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. View Available Seats\n2. Book a Seat\n3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Seats: ");
                for (int i = 0; i < seats.length; i++) {
                    System.out.print("[" + (i + 1) + ":" + (seats[i] ? "Booked" : "Available") + "] ");
                }
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Enter seat number to book (1-10): ");
                int seatNum = sc.nextInt() - 1;
                if (seatNum >= 0 && seatNum < 10) {
                    if (!seats[seatNum]) {
                        seats[seatNum] = true;
                        System.out.println("Seat " + (seatNum + 1) + " booked successfully!");
                    } else {
                        System.out.println("Seat already taken!");
                    }
                } else {
                    System.out.println("Invalid seat number!");
                }
            } else {
                break;
            }
        }
    }
}

// ==========================================
// CONTACT MANAGEMENT SYSTEM
// ==========================================
class ContactSystem {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> contacts = new HashMap<>();

        while (true) {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact\n2. Search Contact\n3. View All\n4. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();
                contacts.put(name, phone);
                System.out.println("Contact saved!");
            } else if (choice == 2) {
                System.out.print("Enter Name to search: ");
                String name = sc.nextLine();
                if (contacts.containsKey(name)) {
                    System.out.println("Phone: " + contacts.get(name));
                } else {
                    System.out.println("Contact not found!");
                }
            } else if (choice == 3) {
                System.out.println("Your Contacts:");
                for (String name : contacts.keySet()) {
                    System.out.println(name + " : " + contacts.get(name));
                }
            } else {
                break;
            }
        }
    }
}