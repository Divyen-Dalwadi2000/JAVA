/*
1) 
Write application that creates an array of double, to provide following functionality.
 display the length of the array and its elements.
 Display an array. (Use for each version of loop for display).
 compute the sume of the squares of these numbers.
 Determine Mean and Median of an array.
 Sort an array – Ascending and Descending. Use any two sorting algorithm. User can also select the sorting method.
 Search an element from the array, i.e. returns the location of the element of an array that matches an indicated value.
 Copy of an array.
 Reverse of an array.
*/
package pack2;

import java.util.Scanner;

public class One2 {

  public static void main(String[] args) {
    int ch = 0,i,j;
    Scanner choice = new Scanner(System.in);
    Scanner arey = new Scanner(System.in);
    double array[] = new double[];

    System.out.print("Enter the Element of the array : ");

    for (i = 0; i < array.length; i++) {
      array[i] = arey.nextDouble();
    }

    for (i = 0; i < array.length; i++) {
      System.out.print(array[i] + "  ");
    }


    while (ch < 9) {
      System.out.println(
        "\nEnter 1 for display the length of the array and its elements"
      );
      System.out.println("Enter 2 for Display an array.  ");
      System.out.println(
        "Enter 3 for compute the sume of the squares of these numbers."
      );
      System.out.println("Enter 4 for Determine Mean and Median of an array.");
      System.out.println(
        "Enter 5 for Sort an array . Ascending and Descending."
      );
      System.out.println("Enter 6 for ");
      System.out.println("Enter 7 for ");
      System.out.println("Enter 8 for ");
      System.out.println("(-_-)Enter 9 for Exit(-_-) ");
      System.out.print("Enter Your Choice : ");
      ch = choice.nextInt();
      System.out.println(ch);
      switch (ch) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          int ch5 = 0;
          // double temp, array[];
          while (ch5 < 3) {
            System.out.println("\nEnter 1 for Bubble sort ");
            System.out.println("Enter 2 for Insertion sort ");
            System.out.println("Enter 3 for Exit ");

            switch (ch) {
              case 1:
                // for (i = 0; i < array.length(); i++) {
                //   for (j = 0; j < array.length(); j++) {
                //     if (array[j] > array[j + 1]) {
                //       temp = arrray[i];
                //       arrray[i] = arrray[i + 1];
                //       array[i + 1] = temp;
                //     }
                //   }
                // }
                break;
              case 2:
                break;
              case 3:
                break;
              default:
                System.out.println("Invalid choice for 5 ");
            }
          }
          break;
        case 6:
          break;
        case 7:
          break;
        case 8:
          break;
        case 9:
          System.out.println("Exit");
          break;
        default:
          System.out.println("Invalid choice");
      }
    }
  }
}
