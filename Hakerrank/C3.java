import java.util.Scanner;

public class C3 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    // String n = s.nextLine();
    if (n >= 1 && n <= 100) {
      if (n >= 2 && n <= 5) {
        if (n % 2 == 0) {
          System.out.println("Not Weird");
        } else {
          System.out.println("Weird");
        }
      } else if (n >= 6 && n <= 20) {
        if (n % 2 == 0) {
          System.out.println("Weird");
        } else {
          System.out.println("Not Weird");
        }
      } else if (n > 20) {
        if (n % 2 == 0) {
          System.out.println("Not Weird");
        } else {
          System.out.println("Weird");
          
        }
      }
    }
  }
}
