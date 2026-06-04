import java.util.Scanner;

public firstclass day1 {   
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("\nMultiplication Table for " + number + ":");
        
        // Loop from 1 to 10 to generate the table
        for (int i = 1; i <= 10; i++) {
            // Print the formatted row (e.g., 5 x 1 = 5)
            System.out.println(number + " x " + i + " = " + (number * i));
        }


        
        // Close the scanner resource
        scanner.close();
    }
}