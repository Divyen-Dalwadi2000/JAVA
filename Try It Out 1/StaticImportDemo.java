package pack;

import static java.lang.Math.*; // static import
import static java.lang.System.*; // static import

public class StaticImportDemo {

  public static void main(String[] args) {
    double val = 64.0;
    double sqrroot = sqrt(val); // Access sqrt() method Directly
    // System.out.println("");
    // we don't need to use 'System.out
    out.println("Sq. root of " + val + " is " + sqrroot);
  }
}
/*
 =========
 Output
 =========
 Sq. root of 64.0 is 8.0
 */

