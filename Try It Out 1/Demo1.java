package pack;
// here we import a user define class for compare two numbers
import pack.Compare;

public class Demo1 {

  public static void main(String[] args) {
    int n = 10, m = 12;
    Compare a = new Compare(n, m);
    if (n != m) {
      a.getmax();
    } else System.out.println("both The value are same");
  }
}


/*
 =========
 Output
 =========
maximum value of two number is : 12
 */
