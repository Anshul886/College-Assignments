import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("first number: " + a);
        System.out.println("second number: " + b);
        System.out.println("sum of two numbers: " + sum);
    }
}  