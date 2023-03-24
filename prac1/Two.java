package assgn;

import java.util.Scanner;

class Two {

  public static double conv(Scanner k) {

    System.out.println(" -- Enter a Valid Kilometers to convert it into miles -- ");
    System.out.print("Enter a Kilometer : ");
    int km = k.nextInt();
    double miles = km * 0.6214;

    return miles;
  }

  public static void main(String args[]) {

    Scanner k = new Scanner(System.in);
    double ans = conv(k);

    System.out.printf("The miles are %.2f ", ans);

  }
}


/*
 -- Enter a Valid Kilometers to convert it into miles --
Enter a Kilometer : 12
The miles are 7.46
*/