import java.util.ArrayList;
import java.util.Scanner;

public class arr {

  public static void main(String[] args) {
    // Initialize an empty array list
    // ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Double> arr = new ArrayList<Double>();

    Scanner scanner = new Scanner(System.in);

    //take user input for each value and add to the array list
    while (true) {
      System.out.print("Enter a value for array (or q for Quite) : ");
      String input = scanner.nextLine();
      if (input.equals("q")) {
        break;
      }
      // int value = Integer.parseInt(input);
      double value = Double.parseDouble(input);
      arr.add(value);
    }

    // double sum = 0;
    // for (int i = 0; i < arr.size(); i++) {
    //       // arr[i] = input.nextDouble();
    //       double sqr = arr[i] * arr[i];
    //       sum += sqr;
    // }
    // System.out.println("The sum of the squre of the element is :  " + sum);

    System.out.println("\nvalues in array ");

    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
    //--------------------------------------------------------
    System.out.println("the array size is : " + arr.size());
    //--------------------------------------------------------
    // number of digit in number then first  convert into string
    for (double d : arr) {
      String strval = Double.toString(d);
      int length = strval.length();
      System.out.println("The value " + d + " has " + length + " digits ");
    }
  }
}
