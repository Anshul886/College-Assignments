import java.util.Scanner;
public class percentagecalculator {
public static void main(String[] agrs) {
    Scanner sc=new Scanner(System.in);  
    System.out.println("enter the marks for 5 sub");
    System.out.println("subject 1");
    int s1=sc.nextInt();
    System.out.println("subject 2");
    int s2=sc.nextInt();
    System.out.println("subject 3");
    int s3=sc.nextInt();
    System.out.println("subject 4");
    int s4=sc.nextInt();
    System.out.println("subject 5");
    int s5=sc.nextInt();
    int totalmarks=s1+s2+s3+s4+s5;
    int percentage=(totalmarks/500)*100;
    System.out.println("total marks: " + totalmarks);
    System.out.println("percentage: " + percentage);
    }
}
