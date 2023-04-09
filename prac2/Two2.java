/*
2) Write a program in Java to create variable size array. Data can be numeric.
 Flush an array
 add a number at a specified location in an anay.
 display the array
 */
package pack2;

import java.util.ArrayList;
import java.util.Scanner;

public class Two2 {

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.print("Enter a size of array : ");
    int size = a.nextInt();

    int[] array = new int[size];

    System.out.println("Enter a Element of an array : ");
    for (int i = 0; i < array.length; i++) {
      array[i] = a.nextInt();
    }

    int ch = 0;
    while (ch < 4) {
      System.out.println("\n\nEnter 1 for for Flush an array");
      System.out.println("Enter 2 for add a number at a specified location in an array.");
      System.out.println("Enter 3 for Display");
      System.out.println("Enter 4 for Exit ");
      System.out.print("Enter a choice :");
      ch = a.nextInt();
      switch (ch) {
        case 1:
          // for flush the array here we initialize again the array
          array = new int[size];
          System.out.println("Array flushed");
          break;
        case 2:
          System.out.print( "Enter a index Number where you want to add the element :"
          );
          int index = a.nextInt();
          if (index < 0 || index > size) {
            System.out.println("Invalid index");
          } else {
            System.out.print("Enter a number :");
            int num = a.nextInt();
            array[index] = num;
            System.out.println("the numberadded to Array");
          }
          break;
        case 3:
          System.out.println("The Entered Elements are : ");
          for (int ele : array) {
            System.out.print(ele + " ");
          }

          break;
        case 4:
          System.out.println("(-_-) Exit (-_-)");
          break;
        default:
          System.out.println("(-_-)Invalid choice(-_-)");
      }
    }
  }
}


/*
============
OUTPUT
============
Enter a size of array : 5
Enter a Element of an array :
11 21 53 55 44


Enter 1 for for Flush an array
Enter 2 for add a number at a specified location in an array.
Enter 3 for Display
Enter 4 for Exit
Enter a choice :3
The Entered Elements are :
11 21 53 55 44

Enter 1 for for Flush an array
Enter 2 for add a number at a specified location in an array.
Enter 3 for Display
Enter 4 for Exit
Enter a choice :1
Array flushed


Enter 1 for for Flush an array
Enter 2 for add a number at a specified location in an array.
Enter 3 for Display
Enter 4 for Exit
Enter a choice :3
The Entered Elements are :
0 0 0 0 0

Enter 1 for for Flush an array
Enter 2 for add a number at a specified location in an array.
Enter 3 for Display
Enter 4 for Exit
Enter a choice :2
Enter a index Number where you want to add the element :2
Enter a number :124
the numberadded to Array


Enter 1 for for Flush an array
Enter 2 for add a number at a specified location in an array.
Enter 3 for Display
Enter 4 for Exit
Enter a choice :3
The Entered Elements are :
0 0 124 0 0

Enter 1 for for Flush an array
Enter 2 for add a number at a specified location in an array.
Enter 3 for Display
Enter 4 for Exit
Enter a choice :4
(-_-) Exit (-_-)
*/