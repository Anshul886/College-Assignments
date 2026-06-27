import java.util.Scanner;

// Student Management
class Student {
    int rollNo;
    String name;
    double marks;

    void input(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    void display() {
        System.out.println("\n----- Student Record -----");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }
}

// Employee Management
class Employee {
    int empId;
    String empName;
    String department;

    void input(Scanner sc) {
        System.out.print("\nEnter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void display() {
        System.out.println("\n----- Employee Record -----");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + empName);
        System.out.println("Department  : " + department);
    }
}

// Salary Management
class Salary {
    int empId;
    String empName;
    double basicSalary, hra, da, grossSalary;

    void input(Scanner sc) {
        System.out.print("\nEnter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\n----- Salary Details -----");
        System.out.println("Employee ID  : " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA          : " + hra);
        System.out.println("DA           : " + da);
        System.out.println("Gross Salary : " + grossSalary);
    }
}

// Main Class
public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        Employee e = new Employee();
        Salary sal = new Salary();

        System.out.println("===== Student Management System =====");
        s.input(sc);
        s.display();

        System.out.println("\n===== Employee Management System =====");
        e.input(sc);
        e.display();

        System.out.println("\n===== Salary Management System =====");
        sal.input(sc);
        sal.display();

        sc.close();
    }
}