import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== DAY 30 MENU =====");
            System.out.println("1. Student Record System");
            System.out.println("2. Mini Library System");
            System.out.println("3. Mini Employee Management System");
            System.out.println("4. Mini Project (Student Database)");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    StudentRecord.run(sc);
                    break;
                case 2:
                    MiniLibrary.run(sc);
                    break;
                case 3:
                    EmployeeManagement.run(sc);
                    break;
                case 4:
                    MiniProject.run(sc);
                    break;
                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

class StudentRecord {
    public static void run(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] roll = new int[n];
        String[] name = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Roll: ");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\nStudent Records");
        System.out.println("Roll\tName\tMarks");
        for (int i = 0; i < n; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
        }
    }
}

class MiniLibrary {
    public static void run(Scanner sc) {
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] books = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.println("\nAvailable Books:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nEnter book name to search: ");
        String search = sc.nextLine();

        boolean found = false;
        for (String b : books) {
            if (b.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Book Found");
        else
            System.out.println("Book Not Found");
    }
}

class EmployeeManagement {
    public static void run(Scanner sc) {
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] id = new int[n];
        String[] name = new String[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.print("ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
        }

        System.out.println("\nEmployee Details");
        System.out.println("ID\tName\tSalary");
        for (int i = 0; i < n; i++) {
            System.out.println(id[i] + "\t" + name[i] + "\t" + salary[i]);
        }
    }
}

class MiniProject {

    static void display(int[] roll, String[] name, int[] marks, int n) {
        System.out.println("\nStudent Database");
        System.out.println("Roll\tName\tMarks");
        for (int i = 0; i < n; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
        }
    }

    static void search(int[] roll, String[] name, int[] marks, int n, int r) {
        for (int i = 0; i < n; i++) {
            if (roll[i] == r) {
                System.out.println("Record Found");
                System.out.println("Roll: " + roll[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }
        System.out.println("Record Not Found");
    }

    public static void run(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] roll = new int[n];
        String[] name = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Roll: ");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
        }

        display(roll, name, marks, n);

        System.out.print("\nEnter Roll Number to Search: ");
        int r = sc.nextInt();
        search(roll, name, marks, n, r);
    }
}