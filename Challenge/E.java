package quiz;

public class E {

  public static void main(String[] args) {
    int x = 5, y = 10;
    int z = (x < y) ? x + y : x - y;
    if (z > 0) {
      System.out.println("Positive");
    } else if (z < 0) {
      System.out.println("Negative");
    } else {
      System.out.println("Zero");
    }
  }
}

// Positive
