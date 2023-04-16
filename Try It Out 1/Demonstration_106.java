// Run the following program without exception handling mechanism for some input

// Case : try with multiple catch block
/*
 
package p2;
public class Demonstration_106 {
    
  public static void main(String[] args) {
    int i = args.length; // No of arguments in the command line
    String myString[] = new String[i];
    myString[0] = args[0];

    if (myString[0].equals("java")) {
      System.out.println("First Word is java ");
    }
    System.out.println("Number of argument = " + i);
    int x = 12 / i;
    int y[] = { 555, 999 };
    y[i] = x;
}
}

*/


/* 
===================
Run time Exception
===================
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at p2.Demonstration_106.main(Demonstration_106.java:11)
 */





 /*
 ------------------------------------------------------------------------------------------------------------------
  ======================
  with catch block
  ======================
  */
// /*  
  package p2;

public class Demonstration_106 {

  public static void main(String[] args) {
    try {
      int i = args.length; // No of arguments in the command line
      String myString[] = new String[i];
      myString[0] = args[0];

      if (myString[0].equals("java")) {
        System.out.println("First Word is java ");
      }

      System.out.println("Number of argument = " + i);
      int x = 12 / i;
      int y[] = { 555, 999 };
      y[i] = x;
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException occurred: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Some other exception occurred: " + e.getMessage());
    }
  }
}
// */





/*
=============================================================================
In this modified code, we have added a try-catch block to handle exceptions that can be thrown by the program. We have added three catch blocks, each to handle a specific type of exception. The first catch block handles ArithmeticException, which can occur if the value of i is 0. The second catch block handles ArrayIndexOutOfBoundsException, which can occur if no arguments are passed to the program. The third catch block handles all other types of exceptions that may occur during the execution of the program.

Now, if we run the program without any arguments, the output will be:
=================
OUTPUT 
================= 
ArrayIndexOutOfBoundsException occurred: Index 0 out of bounds for length 0

*/
