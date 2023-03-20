/*
4) write and un java program to calculate factorial and the cude of the given integer number .
also find the sum and multiplication of digits . also check whether the no entered is palindrom
 or not.
 */

package assgn;

import java.util.Scanner;

//============================================================
public class Four {

  public static void main(String[] args) {
    int ch = 0, sum = 0, fac = 1, mul = 1, remainder, reversed =
      0, number, original;
    Scanner num = new Scanner(System.in);
    System.out.print("Enter a number for n : ");
    int n = num.nextInt();

    while (ch != 6) {
      System.out.println("\n");
      System.out.println("Enter 1 for Factorial ");
      System.out.println("Enter 2 for Cube ");
      System.out.println("Enter 3 for Sum of its Digits ");
      System.out.println("Enter 4 for Multiplication of its Digits ");
      System.out.println("Enter 5 for check the number is palindrome or not ");
      System.out.println("Enter 6 for Exit ");
      System.out.print("\n Enter Your Choice : ");
      ch = num.nextInt();

      switch (ch) {
        case 1:
          for (int i = 1; i <= n; i++) {
            fac = fac * i;
          }
          System.out.printf("The factorial of %d is  : %d", n, fac);
          break;
        case 2:
          System.out.printf("\n The Cube of %d is :", n);
          System.out.print(n * n * n);

          break;
        case 3:
          while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
          }
          System.out.print("The sum of the Digit is : " + sum);
          break;
        case 4:
          while (n != 0) {
            mul = mul * (n % 10);
            n = n / 10;
          }
          System.out.print("The multiplication of the Digit is : " + mul);
          break;
        case 5:
          System.out.print("Enter a number for check palindrom : ");
          number = num.nextInt();
          original = number;

          while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
          }
          if (original == reversed) {
            System.out.printf("%d is a palindrome number ", original);
          }
          else
          System.out.printf("%d is not a palindrome number ", original);

          break;
        case 6:
          System.out.println("(-_-) Exit (-_-) ");
          break;
        default:
          System.out.println("Invalid Choice");
      }
    }
  }
}

/*
============
OUTPUT
============

Enter a number for n : 11

Enter 1 for Factorial
Enter 2 for Cube
Enter 3 for Sum of its Digits
Enter 4 for Multiplication of its Digits
Enter 5 for check the number is palindrome or not
Enter 6 for Exit

Enter Your Choice : 1
The factorial of 11 is  : 39916800

Enter 1 for Factorial
Enter 2 for Cube
Enter 3 for Sum of its Digits
Enter 4 for Multiplication of its Digits
Enter 5 for check the number is palindrome or not
Enter 6 for Exit

Enter Your Choice : 2
 The Cube of 11 is :1331

Enter 1 for Factorial
Enter 2 for Cube
Enter 3 for Sum of its Digits
Enter 4 for Multiplication of its Digits
Enter 5 for check the number is palindrome or not
Enter 6 for Exit

Enter Your Choice : 3
The sum of the Digit is : 2

Enter 1 for Factorial
Enter 2 for Cube
Enter 3 for Sum of its Digits
Enter 4 for Multiplication of its Digits
Enter 5 for check the number is palindrome or not
Enter 6 for Exit

Enter Your Choice : 4
The multiplication of the Digit is : 1

Enter 1 for Factorial
Enter 2 for Cube
Enter 3 for Sum of its Digits
Enter 4 for Multiplication of its Digits
Enter 5 for check the number is palindrome or not
Enter 6 for Exit

Enter Your Choice : 5
Enter a number for check palindrom : 121
121 is a palindrome number

Enter 1 for Factorial
Enter 2 for Cube
Enter 3 for Sum of its Digits
Enter 4 for Multiplication of its Digits
Enter 5 for check the number is palindrome or not
Enter 6 for Exit

Enter Your Choice : 6
(-_-) Exit (-_-)

*/