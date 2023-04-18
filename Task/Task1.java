
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("I will create a multiplication table for you! ");
        while (n1 <= 0) {
            System.out.println("Please enter first number:");
            n1 = num.nextInt();

        }
        while (n2 <= 0) {
            System.out.println("Please enter Second number:");
            n2 = num.nextInt();
        }

        System.out.println("The First number is :" + n1);
        System.out.println("The Second number is :" + n2);

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                // System.out.print((i * j) + " ");
                int ans = i * j;
                System.out.printf("%3d", ans);
            }
            System.out.println();
        }
    }
}

/*
  I will create a multiplication table for you!
  Please enter first number:
  4
  Please enter Second number:
  -6
  Please enter Second number:
  5
  The First number is :4
  The Second number is :5
  1  2  3  4  5
  2  4  6  8 10
  3  6  9 12 15
  4  8 12 16 20
 */
