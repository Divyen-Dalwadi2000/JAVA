// (line no 12) અહી package import નું sentence લખ્યા વગર direct તેનો object બનાવ્યો છે
package pack;

// here we import a user define class for compare two numbers
// import pack.Compare;

public class Demo2 {

  public static void main(String[] args) {
    int n = 22, m = 11;
    // using fully Qualified name instead of import
    pack.Compare a = new pack.Compare(n, m);
    if (n != m) {
      a.getmax();
    } else System.out.println("both The value are same");
  }
}
/*
 =========
 Output
 =========
maximum value of two number is : 22
 */
