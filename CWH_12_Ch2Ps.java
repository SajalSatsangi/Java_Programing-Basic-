import java.util.Scanner;

public class CWH_12_Ch2Ps {
  public static void main(String[] args) {
    System.out.println("Quetion 1 : ");
    float c = 7 / 4.0f * 9 / 2.0f;
    System.out.println(c);

    System.out.println("\nQuetion 2 : ");
    char grade = 'B';
    grade = (char) (grade + 8); // encrypting
    System.out.println(grade);
    grade = (char) (grade - 8); // decrypting
    System.out.println(grade);

    System.out.println("\nQuetion 3 : ");
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number : ");
      int b = sc.nextInt();
      System.out.println(b > 8);
    }

    System.out.println("\nQuetion 4 : ");
    int v = 12, u = 54, a = 43, s = 7;
    float x = (v * v - u * u) / (2 * a * s);
    System.out.println(x);

    System.out.println("\nQuetion 5 : ");
    int y = 7;
    int z = 7 * 49 / 7 + 35 / 7;
    System.out.println(y);
    System.out.println(z);
  }
}