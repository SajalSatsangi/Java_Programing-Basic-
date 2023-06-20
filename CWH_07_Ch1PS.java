import java.util.Scanner;

public class CWH_07_Ch1PS {
  public static void main(String[] args) {
    System.out.println("Quetion 1 : ");
    int a = 4;
    int b = 7;
    int c = 6;
    int sum = a + b + c;
    System.out.print("\tSum : ");
    System.out.println(sum);

    System.out.println("\nQuetion 2 : ");
    float subject1 = 45;
    float subject2 = 95;
    float subject3 = 48;
    float cgpa = (subject1 + subject2 + subject3) / 3;
    System.out.print("\tCGPA : ");
    System.out.println(cgpa);

    System.out.println("\nQuetion 3 : ");
    System.out.println("What is your name ?");
    try (Scanner sc = new Scanner(System.in)) {
      String name = sc.next();
      System.out.println("\tHello " + name + " have a good day!");

      System.out.println("\nQuetion 4 : ");
      System.out.print("Enter the kilometers : ");
      float kilometer = sc.nextInt();
      float miles = (float) (kilometer * 0.621371);
      System.out.print("Miles : ");
      System.out.println(miles);

      System.out.println("\nQuetion 5 : ");
      System.out.print("Enter your number : ");
      System.out.println(sc.hasNextInt());
    }
  }
}
