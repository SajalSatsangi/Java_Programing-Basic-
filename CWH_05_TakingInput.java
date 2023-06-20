import java.util.Scanner;

public class CWH_05_TakingInput {

  public static void main(String[] args) {
    System.out.print("Takking Input From The User : ");
    try (Scanner sc = new Scanner(System.in)) {
      // System.out.print("Enter number 1 : ");
      // int a = sc.nextInt();

      // float a = sc.nextFloat();
      // System.out.print("Enter number 2 : ");
      // int b = sc.nextInt();
      // float b = sc.nextFloat();

      // int sum = a + b;
      // float sum = a + b;
      // System.out.print("The sum of these numbers is ");
      // System.out.println(sum);

      // boolean b1 = sc.hasNextInt();
      // System.out.println(b1);
      // String str = sc.next();
      String str = sc.nextLine();
      System.out.println(str);
    }
  }
}