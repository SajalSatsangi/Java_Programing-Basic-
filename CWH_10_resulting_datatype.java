public class CWH_10_resulting_datatype {
  public static void main(String[] args) {

    // byte x = 5;
    // // int y = 6;
    // // short z = 8;
    // // int a = 45 + 4;
    // float b = 6.54f + x;
    // System.out.println(b);

    // Increment and Decrement Operator
    int i = 56;
    // int b = i++; // first b is assingned i then printed and (56) then i
    // incremented
    // int j = 67;
    // int c = ++j; //first j is incremented then c is assigned j then printed(68)
    System.out.println(i++);
    System.out.println(i);
    System.out.println(++i);
    System.out.println(i);

    // Quick quiz
    int y = 7;
    int x = ++y * 8;
    System.out.println(x);
    char a = 'B';
    a++;
    System.out.println(a);

  }
}
