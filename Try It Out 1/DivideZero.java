package p2;
public class DivideZero {

  static int fun(int x, int y) {
    int a = x / y;
    return (a);
  }

  public static void main(String[] args) {
    int result = fun(25 , 0);
    System.out.println("RESULT IS :  " + result);
  }
}


/*
==========================
Run time Exception
==========================
 Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DivideZero.fun(DivideZero.java:4)
        at DivideZero.main(DivideZero.java:9)
 */