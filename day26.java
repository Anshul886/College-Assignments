import java.util.Random;
import java.util.Scanner;

public class day26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== DAY 26 PROGRAMS =====");
            System.out.println("1. Number Guessing Game");
            System.out.println("2. Voting Eligibility System");
            System.out.println("3. ATM Simulation");
            System.out.println("4. Quiz Application");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    numberGuessingGame(sc);
                    break;
                case 2:
                    votingEligibility(sc);
                    break;
                case 3:
                    atmSimulation(sc);
                    break;
                case 4:
                    quizApplication(sc);
                    break;
                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    // Q101 - Number Guessing Game
    static void numberGuessingGame(Scanner sc) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("\nGuess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High!");
            else if (guess < number)
                System.out.println("Too Low!");
            else
                System.out.println("Congratulations! You guessed correctly.");
        } while (guess != number);
    }

    // Q102 - Voting Eligibility System
    static void votingEligibility(Scanner sc) {
        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");
    }

    // Q103 - ATM Simulation
    static void atmSimulation(Scanner sc) {
        double balance = 10000;

        while (true) {
            System.out.println("\nATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit ATM");

            System.out.print("Choose option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit Successful.");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Option.");
            }
        }
    }

    // Q104 - Quiz Application
    static void quizApplication(Scanner sc) {
        int score = 0;

        System.out.println("\nJava Quiz");

        System.out.println("Q1. Which keyword is used to inherit a class?");
        System.out.println("1. implements");
        System.out.println("2. extends");
        System.out.println("3. inherit");
        System.out.println("4. super");
        System.out.print("Answer: ");
        if (sc.nextInt() == 2)
            score++;

        System.out.println("\nQ2. Which method is the entry point of a Java program?");
        System.out.println("1. start()");
        System.out.println("2. init()");
        System.out.println("3. main()");
        System.out.println("4. run()");
        System.out.print("Answer: ");
        if (sc.nextInt() == 3)
            score++;

        System.out.println("\nQ3. Java is?");
        System.out.println("1. Platform Independent");
        System.out.println("2. Platform Dependent");
        System.out.println("3. Operating System");
        System.out.println("4. Database");
        System.out.print("Answer: ");
        if (sc.nextInt() == 1)
            score++;

        System.out.println("\nYour Score: " + score + "/3");
    }
}