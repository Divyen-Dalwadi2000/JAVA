/*
3) 
Program in Java to find A+B, A-B, A*B and transpose of A, where A is a matrix of 3*3 and B is a matrix of 3*4.
Take the values in matrixes A and B 
from the user.
 */
package pack2;

import java.util.Scanner;

public class Three2 {

  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int rowsA = 3, colsA = 3;
    int rowsB = 3, colsB = 4;

    int a[][] = new int[rowsA][colsA];
    int b[][] = new int[rowsB][colsB];
    int tran[][] = new int[rowsA][rowsA];
    int c[][] = new int[rowsA][colsB];

    System.out.println(
      "-----------Enter value for First 3 x 3 matrix----------- \n"
    );

    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsA; j++) {
        a[i][j] = num.nextInt();
      }
      System.out.println("");
    }

    System.out.println(
      "-----------Enter value for Second 3 x 3 matrix----------- \n"
    );
    for (int i = 0; i < rowsB; i++) {
      for (int j = 0; j < colsB; j++) {
        b[i][j] = num.nextInt();
      }
      System.out.println("");
    }

    System.out.println(
      "-----------The Transpose of A 3 x3 matrix ----------- \n "
    );
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsA; j++) {
        tran[j][i] = a[i][j];
      }
      System.out.println("");
    }
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsA; j++) {
        System.out.print(tran[i][j] + " ");
      }
      System.out.println("");
    }

    //---------------------------------------------------------------------------------------------------------------
    System.out.println("-----------Entered Matrix are-----------\n ");
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsA; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("");

    for (int i = 0; i < rowsB; i++) {
      for (int j = 0; j < colsB; j++) {
        System.out.print(b[i][j] + " ");
      }
      System.out.println("");
    }
    //---------------------------------------------------------------------------------------------------------------
    if (colsA != rowsB) {
      System.out.println(
        "(-_-)ERROR:(-_-)\n the number of columns in matrix A must match the number of rows in matrix B."
      );
      return;
    }
    System.out.println(
      "-----------The Multiplication of 3 x 3 * 3 x 4 matrix ----------- \n "
    );
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsB; j++) {
        int sum = 0;
        for (int k = 0; k < colsA; k++) {
          sum = sum + a[i][k] * b[k][j];
        }
        c[i][j] = sum;
      }
      System.out.println("");
    }
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsB; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("");

    System.out.println("");
    //--------------------------------------------------------------------
    if (colsA != colsA && rowsA != rowsB) {
      System.out.println(
        "(-_-)ERROR:(-_-)\n the number of columns and rows  in matrix A must match the number of rows and column in matrix B."
      );
      return;
    }
    System.out.println(
      "-----------The Addithion of 3 x 3 matrix ----------- \n "
    );
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = a[i][j] + b[i][j];
        System.out.print(c[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println(
      "-----------The sbstraction of 3 x 3 matrix ----------- \n "
    );
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = a[i][j] - b[i][j];
        System.out.print(c[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
/*
-----------Enter value for First 3 x 3 matrix-----------

1 2 3 4 5 6 7 8 9

-----------Enter value for Second 3 x 3 matrix-----------

1 2 3 4 5 6 7 8 9 10 11 12

-----------Entered Matrix are-----------

1 2 3
4 5 6
7 8 9

1 2 3 4
5 6 7 8
9 10 11 12

-----------The Transpose of A 3 x3 matrix -----------

1 4 7
2 5 8
3 6 9
-----------The Multiplication of 3 x 3 * 3 x 4 matrix -----------

38 44 50 56
83 98 113 128
128 152 176 200

-----------The Addithion of 3 x 3 matrix -----------

2 4 6
9 11 13
16 18 20
-----------The sbstraction of 3 x 3 matrix -----------

0 0 0
-1 -1 -1
-2 -2 -2

*/
