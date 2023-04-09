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
import java.util.Arrays;
import java.util.Scanner;

public class One2 {

  public static void main(String[] args) {
    int ch = 0, i, j;
    Scanner choice = new Scanner(System.in);
    Scanner arey = new Scanner(System.in);

    ArrayList<Double> list = new ArrayList<Double>();

    System.out.println(
      "Enter the Element of the array (Press 'done' to finish): "
    );

    while (arey.hasNextDouble()) {
      double num = arey.nextDouble();
      list.add(num);
    }

    while (ch < 9) {
      System.out.println(
        "\nEnter 1 for display the length of the array and its elements"
      );
      System.out.println("Enter 2 for Display an array.  ");
      System.out.println(
        "Enter 3 for compute the sum of the squares of these numbers."
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
          System.out.println(
            "The length of the array is : " + list.size() + "\n"
          );

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

          // System.out.println("\n=============MEDIAN===============");
          // int size = list.size();
          // ArrayList<Double> cp1 = Arrays.copyOf(list , );
          
          // Arrays.sort(list);
          // double mid1 = list.get(size / 2 - 1);
          // double mid2 = list.get(size / 2);

          // if (list.size() % 2 == 0) {
          //   median = (mid1 + mid2) / 2;
          // }
          break;
        case 5:
          int ch5 = 0;
          while (ch5 < 3) {
            System.out.println("\n\nEnter 1 for Bubble sort ");
            System.out.println("Enter 2 for Insertion sort ");
            System.out.println("Enter 3 for Exit ");
            System.out.print("Enter Your choice5 : ");
            ch5 = choice.nextInt();
            switch (ch5) {
              case 1:
                System.out.println(
                  "\n===============Bubble Short=============== "
                );
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
