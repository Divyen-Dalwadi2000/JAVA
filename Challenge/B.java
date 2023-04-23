package quiz;
public class B {

  public static void main(String[] args) {
    int x = 5;
    boolean flag = true;
    if (x = 10 || flag == true) {
      System.out.println("A");
    } else {
      System.out.println("B");
    }
  }
}


/*
 javac -d . B.java
B.java:6: error: bad operand types for binary operator '||'
    if (x = 10 || flag == true) {
               ^
  first type:  int
  second type: boolean
B.java:6: error: incompatible types: int cannot be converted to boolean
    if (x = 10 || flag == true) {
          ^
2 errors

 */