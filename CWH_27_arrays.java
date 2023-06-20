public class CWH_27_arrays {
  public static void main(String[] args) {
    int[] marks = new int[5];
    System.out.println(marks.length);

    // ----->>>>> by simple for loop
    // for (int i = 0; i < marks.length; i++)
    // System.out.println(marks[i]);

    // for-each-loop
    for (int element : marks)
      System.out.println(element);
  }
}