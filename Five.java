/*
5) write a java program to calculate the minimum of three integer numbers: 
===========
JAVA
===========
*/
package pack;

import java.util.Scanner;

public class Five {

  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Enter First number : ");
    int a = num.nextInt();
    System.out.print("Enter Second number : ");
    int b = num.nextInt();
    System.out.print("Enter Third number : ");
    int c = num.nextInt();

    if (a < b && a < c) {
      System.out.printf("the %d is smallest among Three ", a);
    } else if (b < a && b < c) {
      System.out.printf("the %d is smallest among Three ", b);
    } else {
      System.out.printf("the %d is smallest among Three ", c);
    }
  }
}
/*
=>> Integer test cases

===========
OUTPUT
===========
Enter First number : 5
Enter Second number : 3
Enter Third number : 8

the 3 is smallest among Three
===================================
Enter First number : -10
Enter Second number : -5
Enter Third number : -20

the -20 is smallest among Three
===================================
Enter First number : 0
Enter Second number : 5
Enter Third number : 10

the 0 is smallest among Three
===================================
Enter First number : 10
Enter Second number : 5
Enter Third number : 10

the 5 is smallest among Three
===================================
Enter First number : 2
Enter Second number : 2
Enter Third number : 2

the 2 is smallest among Three

*/
