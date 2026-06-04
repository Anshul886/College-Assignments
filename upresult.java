import java.util.Scanner;
 public class upresult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your hindi marks");
        int hindi=sc.nextInt();
        System.out.println("enter your english marks");
        int english=sc.nextInt();
        System.out.println("enter your maths marks");
        int maths=sc.nextInt();
        System.out.println("enter your science marks");
        int science=sc.nextInt();
        System.out.println("enter your social science marks");
        int social=sc.nextInt();
        System.out.println("enter your drawing marks");
        int drawing=sc.nextInt();
        int totalmarks=hindi+english+maths+science+social+drawing;
        int percentage=(totalmarks/6);
        System.out.println("total marks: " + totalmarks);   
        System.out.println("percentage: " + percentage);
    }
}