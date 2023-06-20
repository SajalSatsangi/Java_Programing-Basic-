import javax.sound.sampled.SourceDataLine;

public class CWH_08_operators {
  public static void main(String[] args) {
    // 1. Arthmatic operators
    // int a = 4;
    // int b = 6 + a;
    // int b = 6 - a;
    // int b = 6 * a;
    // int b = 6 / a;
    // int b = 6 % a; //modulo operator
    // 4.8%1.1 --->REturn_Decimal Remainder

    // 2. assingment operator
    int b = 9;
    b *= 3;
    System.out.println(b);

    // 3. comparision operator
    System.out.println(6 == 8);
    // System.out.println(6 == 6);
    System.out.println(64 < 6);

    // 4. logical operator
    // System.out.println(64 > 5 && 64 > 8);
    System.out.println(64 > 5 && 64 > 98);

    // 5. bitwise operator
    System.out.println(2 & 3);
  }
}//