/*
1) 
Write application that creates an array of double, to provide following functionality.
 display the length of the array and its elements.
 Display an array. (Use for each version of loop for display).
 compute the sum of the squares of these numbers.
 Determine Mean and Median of an array.
 Sort an array – Ascending and Descending. Use any two sorting algorithm. User can also select the sorting method.
 Search an element from the array, i.e. returns the location of the element of an array that matches an indicated value.
 Copy of an array.
 Reverse of an array.
*/
package pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class One2 {

  public static void main(String[] args) {
    int ch = 0, i, j;
    Scanner choice = new Scanner(System.in);
    Scanner arey = new Scanner(System.in);

    ArrayList<Double> list = new ArrayList<>();

    System.out.println( "Enter the Element of the array (Press 'done' to finish): " );

    while (arey.hasNextDouble()) {
      double num = arey.nextDouble();
      list.add(num);
    }

    while (ch < 9) {
      System.out.println( "\nEnter 1 for display the length of the array and its elements" );
      System.out.println("Enter 2 for Display an array using foreach loop  ");
      System.out.println( "Enter 3 for compute the sum of the squares of these numbers.");
      System.out.println("Enter 4 for Determine Mean and Median of an array.");
      System.out.println("Enter 5 for Sort an array . Ascending and Descending.");
      System.out.println("Enter 6 for  Search an element from the array");
      System.out.println("Enter 7 for Copy of an array");
      System.out.println("Enter 8 for Reverse of an array");
      System.out.println("(-_-)Enter 9 for Exit(-_-) ");
      System.out.print("Enter Your Choice : ");
      ch = choice.nextInt();
      System.out.println(ch);
      switch (ch) {
        case 1:
          System.out.println( "The length of the array is : " + list.size() + "\n" );

          for (int k = 0; k < list.size(); k++) {
            System.out.print(list.get(k) + "  ");
          }
          break;
        case 2:
          for (double num : list) {
            System.out.print(num + "  ");
          }
          break;
        case 3:
          double sqr = 0;

          for (double num : list) {
            sqr += num * num;
          }
          System.out.println("\nThe sum of squares :  " + sqr);
          break;
        case 4:
          System.out.println("=============MEAN===============");
          double mean = 0, median = 0, sum = 0;
          for (double num : list) {
            sum += num;
          }
          mean = sum / list.size();
          System.out.println("\n The mean of the array is : " + mean);

          System.out.println("\n=============MEDIAN===============");
          int size = list.size();
          Collections.sort(list);
          // double median;
          if (size % 2 == 0) {
            median = (list.get(size / 2) + list.get(size / 2 - 1)) / 2.0;
          } else {
            median = list.get(size / 2);
          }
          System.out.println("\n The Median of the array is : " + median);
          break;
        case 5:
          int ch5 = 0;
          while (ch5 < 5) {
            System.out.println(
              "\n\nEnter 1 for Bubble sort (Accending order) "
            );
            System.out.println("Enter 2 for Bubble sort (Decending order) ");
            System.out.println(
              "Enter 3 for  Insertion sort  (Accending order) "
            );
            System.out.println(
              "Enter 4 for  Insertion sort  (Decending order) "
            );
            System.out.println("Enter 5 for Exit ");
            System.out.print("Enter Your choice5 : ");
            ch5 = choice.nextInt();
            switch (ch5) {
              case 1:
                System.out.println( "\n===============Bubble Short=============== " );
                System.out.println( "\n===============Accending order=============== " );
                for (i = 0; i < list.size() - 1; i++) {
                  for (j = 0; j < list.size() - 1; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                      double temp = list.get(j);
                      list.set(j, list.get(j + 1));
                      list.set(j + 1, temp);
                    }
                  }
                }
                for (i = 0; i < list.size(); i++) {
                  System.out.print(list.get(i) + " ");
                }
                break;
              case 2:
                System.out.println("\n===============Bubble Short=============== " );
                System.out.println("\n===============Decending order=============== ");
                for (i = 0; i < list.size() - 1; i++) {
                  for (j = 0; j < list.size() - 1; j++) {
                    if (list.get(j) < list.get(j + 1)) {
                      double temp = list.get(j);
                      list.set(j, list.get(j + 1));
                      list.set(j + 1, temp);
                    }
                  }
                }
                for (i = 0; i < list.size(); i++) {
                  System.out.print(list.get(i) + " ");
                }
                break;
              case 3:
                System.out.println("\n===============Insertion Short=============== ");
                System.out.println("\n===============Accending order=============== " );
                System.out.println("The insertion sort: ");
                for (i = 1; i < list.size(); i++) {
                  double temp = list.get(i);
                  j = i - 1;

                  while (j >= 0 && list.get(j) > temp) {
                    list.set(j + 1, list.get(j));
                    j--;
                  }
                  list.set(j + 1, temp);
                }

                for (double m : list) {
                  System.out.println(m);
                }
                break;
              case 4:
                System.out.println("\n===============Insertion Short=============== ");
                System.out.println("\n===============Decending order=============== ");
                // INSERTION SORT (descending order)
                System.out.println("The insertion sort (descending order): ");
                for (i = 1; i < list.size(); i++) {
                  double temp = list.get(i);
                  j = i - 1;

                  while (j >= 0 && list.get(j) < temp) {
                    list.set(j + 1, list.get(j));
                    j--;
                  }
                  list.set(j + 1, temp);
                }

                for (double m : list) {
                  System.out.println(m);
                }
                break;
              case 5:
                System.out.println("(-_-) Exit (-_-)");
                break;
              default:
                System.out.println("Invalid choice for 5 ");
            }
          }
          break;
        case 6:
          // prompt the user to enter a value to search for
          System.out.print("Enter a value to search for: ");
          Scanner input = new Scanner(System.in);
          double value = input.nextDouble();

          // search for the value in the list
          int index = -1;
          for (i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
              index = i;
              break;
            }
          }

          // display the search result
          if (index == -1) {
            System.out.println("Value not found in the list.");
          } else {
            System.out.println("Value found at index " + index + ".");
          }

          break;
        case 7:
          ArrayList list2 = (ArrayList) list.clone();
          System.out.println(list2);

          break;
        case 8:
          Collections.reverse(list);
          System.out.println("After reversing an array :");
          System.out.println(list);

          break;
        case 9:
          System.out.println("(-_-) Exit (-_-)");
          break;
        default:
          System.out.println("Invalid choice");
      }
    }
  }
}
/*

===========
OUTPUT
===========
Enter the Element of the array (Press 'done' to finish):
1.0 3.0 4.0 5.0 6.0 2.0
done

Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 1
1
The length of the array is : 6

1.0  3.0  4.0  5.0  6.0  2.0
Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 2
2
1.0  3.0  4.0  5.0  6.0  2.0
Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 3
3

The sum of squares :  91.0

Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 4
4
=============MEAN===============

 The mean of the array is : 3.5

=============MEDIAN===============

 The Median of the array is : 3.5

Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 5
5


Enter 1 for Bubble sort (Accending order)
Enter 2 for Bubble sort (Decending order)
Enter 3 for  Insertion sort  (Accending order)
Enter 4 for  Insertion sort  (Decending order)
Enter 5 for Exit
Enter Your choice5 : 1

===============Bubble Short===============

===============Accending order===============
1.0 2.0 3.0 4.0 5.0 6.0

Enter 1 for Bubble sort (Accending order)
Enter 2 for Bubble sort (Decending order)
Enter 3 for  Insertion sort  (Accending order)
Enter 4 for  Insertion sort  (Decending order)
Enter 5 for Exit
Enter Your choice5 : 2

===============Bubble Short===============

===============Decending order===============
6.0 5.0 4.0 3.0 2.0 1.0

Enter 1 for Bubble sort (Accending order)
Enter 2 for Bubble sort (Decending order)
Enter 3 for  Insertion sort  (Accending order)
Enter 4 for  Insertion sort  (Decending order)
Enter 5 for Exit
Enter Your choice5 : 3

===============Insertion Short===============

===============Accending order===============
The insertion sort:
1.0
2.0
3.0
4.0
5.0
6.0


Enter 1 for Bubble sort (Accending order)
Enter 2 for Bubble sort (Decending order)
Enter 3 for  Insertion sort  (Accending order)
Enter 4 for  Insertion sort  (Decending order)
Enter 5 for Exit
Enter Your choice5 : 4

===============Insertion Short===============

===============Decending order===============
The insertion sort (descending order):
6.0
5.0
4.0
3.0
2.0
1.0


Enter 1 for Bubble sort (Accending order)
Enter 2 for Bubble sort (Decending order)
Enter 3 for  Insertion sort  (Accending order)
Enter 4 for  Insertion sort  (Decending order)
Enter 5 for Exit
Enter Your choice5 : 5
(-_-) Exit (-_-)

Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 6
6
Enter a value to search for: 2.0
Value found at index 4.

Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 7
7
[6.0, 5.0, 4.0, 3.0, 2.0, 1.0]

Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 8
8
After reversing an array :
[1.0, 2.0, 3.0, 4.0, 5.0, 6.0]

Enter 1 for display the length of the array and its elements
Enter 2 for Display an array using foreach loop
Enter 3 for compute the sum of the squares of these numbers.
Enter 4 for Determine Mean and Median of an array.
Enter 5 for Sort an array . Ascending and Descending.
Enter 6 for  Search an element from the array
Enter 7 for Copy of an array
Enter 8 for Reverse of an array
(-_-)Enter 9 for Exit(-_-)
Enter Your Choice : 9
9
(-_-) Exit (-_-)
*/
