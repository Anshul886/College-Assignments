import java.util.*;

public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== DAY29 MENU =====");
            System.out.println("1. Menu Driven Calculator");
            System.out.println("2. Menu Driven Array Operations");
            System.out.println("3. Menu Driven String Operations");
            System.out.println("4. Inventory Management System");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // Q114 Menu Driven Calculator
                case 1:
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();

                    System.out.println("1.Add");
                    System.out.println("2.Subtract");
                    System.out.println("3.Multiply");
                    System.out.println("4.Divide");
                    System.out.print("Choose operation: ");
                    int op = sc.nextInt();

                    switch (op) {
                        case 1:
                            System.out.println("Result = " + (a + b));
                            break;
                        case 2:
                            System.out.println("Result = " + (a - b));
                            break;
                        case 3:
                            System.out.println("Result = " + (a * b));
                            break;
                        case 4:
                            if (b != 0)
                                System.out.println("Result = " + (a / b));
                            else
                                System.out.println("Division by zero not allowed.");
                            break;
                        default:
                            System.out.println("Invalid operation.");
                    }
                    break;

                // Q115 Menu Driven Array Operations
                case 2:
                    System.out.print("Enter array size: ");
                    int n = sc.nextInt();
                    int arr[] = new int[n];

                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();

                    System.out.println("1.Display");
                    System.out.println("2.Sum");
                    System.out.println("3.Maximum");
                    System.out.println("4.Minimum");
                    System.out.println("5.Search");
                    System.out.print("Choose operation: ");
                    int arrChoice = sc.nextInt();

                    switch (arrChoice) {
                        case 1:
                            System.out.print("Array: ");
                            for (int x : arr)
                                System.out.print(x + " ");
                            System.out.println();
                            break;

                        case 2:
                            int sum = 0;
                            for (int x : arr)
                                sum += x;
                            System.out.println("Sum = " + sum);
                            break;

                        case 3:
                            int max = arr[0];
                            for (int x : arr)
                                if (x > max)
                                    max = x;
                            System.out.println("Maximum = " + max);
                            break;

                        case 4:
                            int min = arr[0];
                            for (int x : arr)
                                if (x < min)
                                    min = x;
                            System.out.println("Minimum = " + min);
                            break;

                        case 5:
                            System.out.print("Enter element to search: ");
                            int key = sc.nextInt();
                            boolean found = false;
                            for (int x : arr) {
                                if (x == key) {
                                    found = true;
                                    break;
                                }
                            }
                            if (found)
                                System.out.println("Element Found");
                            else
                                System.out.println("Element Not Found");
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                // Q116 Menu Driven String Operations
                case 3:
                    sc.nextLine();
                    System.out.print("Enter a string: ");
                    String str = sc.nextLine();

                    System.out.println("1.Length");
                    System.out.println("2.Uppercase");
                    System.out.println("3.Lowercase");
                    System.out.println("4.Reverse");
                    System.out.println("5.Check Palindrome");
                    System.out.print("Choose operation: ");
                    int strChoice = sc.nextInt();

                    switch (strChoice) {
                        case 1:
                            System.out.println("Length = " + str.length());
                            break;

                        case 2:
                            System.out.println("Uppercase = " + str.toUpperCase());
                            break;

                        case 3:
                            System.out.println("Lowercase = " + str.toLowerCase());
                            break;

                        case 4:
                            String rev = "";
                            for (int i = str.length() - 1; i >= 0; i--)
                                rev += str.charAt(i);
                            System.out.println("Reverse = " + rev);
                            break;

                        case 5:
                            String reverse = "";
                            for (int i = str.length() - 1; i >= 0; i--)
                                reverse += str.charAt(i);
                            if (str.equals(reverse))
                                System.out.println("Palindrome");
                            else
                                System.out.println("Not Palindrome");
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                // Inventory Management System
                case 4:
                    sc.nextLine();
                    String[] item = new String[5];
                    int[] qty = new int[5];

                    System.out.println("Enter details of 5 items:");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Item Name: ");
                        item[i] = sc.nextLine();
                        System.out.print("Quantity: ");
                        qty[i] = sc.nextInt();
                        sc.nextLine();
                    }

                    System.out.println("\nInventory List");
                    System.out.println("------------------------");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(item[i] + " : " + qty[i]);
                    }
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}