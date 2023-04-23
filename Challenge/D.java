package quiz;

public class D {

  public static void main(String[] args) {
    String[] fruits = { "A", "B", "C", "D", "E" };
    for (int i = 0; i < fruits.length; i++) {
      if (i == 2 || i == 4) {
        continue;
      }
      System.out.println(fruits[i] + "");
    }
  }
}
/*
A
B
D
 */
