/*
8) write an appliction that counts the total number of character in all
of its command line argument
 */
package pack;

public class Eight {

  public static void main(String[] args) {
    if (args.length > 0) {
      int count = 0;

      for (int i = 0; i < args.length; i++) {
        count += args[i].length();
      }
      System.out.println("Total Number of Character : " + count);
    } else {
      System.out.println("Enter a Argument ");
    }
  }
}
/*
==========
output
==========

javac -d . Eight.java

java pack.Eight Divyen Dalwadi

Total Number of Character : 13

 */
