package quiz;
public class H {

  public static void main(String[] args) {
    String str ="Hello, Divyen";
    if (str.contains("Hello")) {
      System.out.println("A");
    } else if (str.indexOf("i") == 7) {
      System.out.println("B");
    } else {
      System.out.println("C");
    }
    // System.out.println(str.indexOf("H"));
}
}

// String indexes start with 0
// A