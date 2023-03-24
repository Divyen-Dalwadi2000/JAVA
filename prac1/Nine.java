/*
9) Write a java program to calculate simple interest using command 
  line arguments (Hint use Wrapper classes)
 */
package pack;

public class Nine {

  public static void main(String[] args) {
    if (args.length == 3) {
      // (p * r * n ) / 100
      System.out.println(
        "Simple Interest : " +
        Integer.parseInt(args[0]) *
        Integer.parseInt(args[1]) *
        Integer.parseInt(args[2]) /
        100
      );
    } else {
      System.out.println("Enter Only Three Arguments ");
    }
  }
}

/*
==========
output
==========
javac -d . Nine.java

java pack.Nine 2000 5 2

Simple Interest : 200
*/