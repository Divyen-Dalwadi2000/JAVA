package quiz;
public class C {

  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    int c = a / b;
    System.out.println(c);
  }
}

/* Runtime Exception
java quiz.C
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at quiz.C.main(c.java:7)
 */