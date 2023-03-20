/*
6) WAP in JAVA that calculate the VAT(Value-Added-Tax) on an amount of
   sale . The Program takes amount of sales nd VAT rate as input and outputs
   the total amount(inclusive of VAT)
 */
package pack;

import java.util.Scanner;

public class Six {

  public static void main(String[] args) {
    Scanner sale = new Scanner(System.in);
    System.out.print("Enter the amount of the Product Sale : ");
    double amount = sale.nextDouble();
    System.out.print("Enter the VAT(Value-Added-Tax) Rate in ( % ) : ");
    double rate = sale.nextDouble();

    double tax_amt = amount * rate / 100;

    System.out.println("The Tax Amount is : " + tax_amt);

    double bill_amt = amount + tax_amt;
    System.out.println("The Total amount (inclusive of VAT) : " + bill_amt);
  }
}

/*
Enter the amount of the Product Sale : 3230
Enter the VAT(Value-Added-Tax) Rate  : 7
The Tax Amount is : 226.1
The Total amount (inclusive of VAT) : 3456.1

*/