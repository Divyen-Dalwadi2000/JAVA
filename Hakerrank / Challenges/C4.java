import java.util.Scanner;

public class C4 {

  public static void main(String[] args) {
    Scanner val = new Scanner(System.in);

    // System.out.print("Enter Integer value :");
    int i = val.nextInt();

    // System.out.print("Enter Double value :");
    double d = val.nextDouble();
    val.nextLine(); // consume the remaining newline character

    // System.out.print("Enter String value :");
    String str = val.nextLine();

    System.out.println("String: " + str);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
}
