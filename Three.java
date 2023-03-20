package assgn;

import java.util.Scanner;

// =========================================================================
public class Three {

  public static void menu() {
    System.out.println("\n\n");
    System.out.println(
      "Enter 1 for Generate First 15 numbers in Fibonacci series "
    );
    System.out.println(
      "Enter 2 for Generate First 15 numbers in Prime Numbers "
    );
    System.out.println("Enter 3 For Exit ");
    System.out.print("Enter Your Choice : ");
  }

  // -----------------------------------------------------------------
  public static int takeInput(Scanner num) {
    int ch = num.nextInt();
    return ch;
  }

  // -----------------------------------------------------------------

  public static int fibonacci(int lim) {
    // System.out.println(lim);

    if (lim == 0) {
      return 0;
    } else if (lim == 1) {
      return 1;
    } else {
      return (fibonacci(lim - 1) + fibonacci(lim - 2));
    }
  }

  // -----------------------------------------------------------------

  public static void primeNum(int n) {
    int x = 2, i;

    while (n >= 0) {
      for (i = 2; i < x; i++) {
        if (x % i == 0) {
          break;
        }
      }
      if (i == x) {
        System.out.printf("%d  ", x);
        n--;
      }
      x++;
    }
  }

  // -----------------------------------------------------------------

  public static void main(String args[]) {
    int choice = 0;
    Scanner num = new Scanner(System.in);

    // System.out.println(choice);
    while (choice != 3) {
      menu();
      choice = takeInput(num);
      switch (choice) {
        case 1:
          System.out.println("\n\n");
          System.out.println("--------Fibonacci Sereies--------");

          for (int i = 0; i <= 15; i++) {
            System.out.printf(" %d  ", fibonacci(i));
          }
          break;
        case 2:
          System.out.print("Enter Value For n :");
          int n = num.nextInt();
          primeNum(n);
          break;
        default:
          System.out.println("(-_-) Exit (-_-) ");
      }
    }
  }
}

/*
============
OUTPUT
============

Enter 1 for Generate First 15 numbers in Fibonacci series
Enter 2 for Generate First 15 numbers in Prime Numbers
Enter 3 For Exit
Enter Your Choice : 1

--------Fibonacci Sereies--------
 0   1   1   2   3   5   8   13   21   34   55   89   144   233   377   610


Enter 1 for Generate First 15 numbers in Fibonacci series
Enter 2 for Generate First 15 numbers in Prime Numbers
Enter 3 For Exit
Enter Your Choice : 2

Enter Value For n :15
2  3  5  7  11  13  17  19  23  29  31  37  41  43  47  53

Enter 1 for Generate First 15 numbers in Fibonacci series
Enter 2 for Generate First 15 numbers in Prime Numbers
Enter 3 For Exit
Enter Your Choice : 3

(-_-) Exit (-_-)
*/