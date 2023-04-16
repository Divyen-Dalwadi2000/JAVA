/*
package p2;

public class Error {

  public static void main(String[] args) {
    System.out.println("can You find error in me ?");
  }
}

class AnotherError {

  public void insert() {
    System.out.println("To insert a text");
  }

  abstract void delete() {
    System.out.println("To delete a text");
  }
}

*/





/*
=====================
Compile Time Error
=====================
Error.java:11: error: AnotherError is not abstract and does not override abstract method delete() in AnotherError
class AnotherError {
^
Error.java:17: error: abstract methods cannot have a body
  abstract void delete() {
                ^
2 errors
-----------------------------------------------------------
 Error in AnotherError class

 1) The abstract method delete in type AnotherError can only be defined by an abstract class
 2)Abstract methods do not specify a body
--------------------------------------------------------------
 */
/*


//  =============================================================================
=================
Right Code
=================
*/

package p2;

public class Error {

  public static void main(String[] args) {
    System.out.println("can You find error in me ?");
  }
}

abstract class AnotherError {

  public void insert() {
    System.out.println("To insert a text");
  }

  // here we remove body of abstract method  
  abstract void delete();
}
