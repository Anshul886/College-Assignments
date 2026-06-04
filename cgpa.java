import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the marks of physics");
     int physics=sc.nextInt();
     System.out.println("enter the marks of ee");
     int ee=sc.nextInt();
      System.out.println("enter the marks of m1");
      int m1=sc.nextInt();
     System.out.println("enter the marks of evs");
      int evs=sc.nextInt();
      System.out.println("enter the marks of pps");
      int pps=sc.nextInt();
      double cgpa=(physics+ee+m1+evs+pps)/5.0;
     System.out.println(" cgpa "+cgpa);
}
}