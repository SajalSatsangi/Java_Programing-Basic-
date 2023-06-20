import java.util.Scanner;

public class CWH_06_Ex1 {
  public static void main(String[] args) {
    System.out.println("Enter the marks out of 100 : ");
    try (Scanner marks = new Scanner(System.in)) {
      float total = 0;
      System.out.print("\tEnter The Max Marks in one Subject : ");
      float total_marks = marks.nextFloat();
      System.out.print("\n\tEnter number 1 : ");
      float a = marks.nextFloat();
      total = total + a;
      System.out.print("\tEnter number 2 : ");
      float b = marks.nextFloat();
      total = total + b;
      System.out.print("\tEnter number 3 : ");
      float c = marks.nextFloat();
      total = total + c;
      System.out.print("\tEnter number 4 : ");
      float d = marks.nextFloat();
      total = total + d;
      System.out.print("\tEnter number 5 : ");
      float e = marks.nextFloat();
      total = total + e;

      float Percentage = (total * 100) / (total_marks * 5);
      System.out.print("\n\nPercentage : ");
      System.out.println(Percentage);
    }
  }
}