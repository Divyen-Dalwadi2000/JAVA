
//********************************************************************

//  Represents a coin with two sides that can be flipped.
//********************************************************************
package task2;

import java.util.Scanner;

// import Coin;

import java.util.Random;

class Coin {
   private final int Heads = 0;
   private final int Tails = 1;

   private int face;

   // -----------------------------------------------------------------
   // Sets up the coin by flipping it initially.
   // -----------------------------------------------------------------
   public Coin() {
      flip();
   }

   // -----------------------------------------------------------------
   // Flips the coin by randomly choosing a face value.
   // -----------------------------------------------------------------
   public void flip() {
      face = (int) (Math.random() * 2);

   }

   // -----------------------------------------------------------------
   // Returns true if the current face of the coin is heads.
   // -----------------------------------------------------------------
   public boolean isHeads() {
      return (face == Heads);
   }

   public int getvalue() {
      return face;
   }

   // -----------------------------------------------------------------
   // Returns the current face of the coin as a string.
   // -----------------------------------------------------------------
   public String toString() {
      String faceName;

      if (face == Heads)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }

}

public class Task2 extends Coin {
   public static void main(String[] args) {
      Scanner name = new Scanner(System.in);
      Scanner toss = new Scanner(System.in);
      T2 obj = new T2();
      System.out.println("Let's play a coin toss game ! ");
      System.out.println("Please enter player 1 :");
      String p1 = name.nextLine();
      System.out.println("Please enter player 2 :");
      String p2 = name.nextLine();
      System.out.println("Please enter player 2 :");
      String p3 = name.nextLine();

      System.out.println(p1);
      System.out.println(p2);
      System.out.println(p3);
      int val;
      while (true) {
         System.out.println("How many Tosses ? ");
         val = toss.nextInt();
         if (val > 0)
            break;
         else
            System.out.println("Enter Again ");
      }
      int i = 0, pl1 = 0, pl2 = 0, pl3 = 0, tie = 0;
      while (i < val) {
         Coin c1 = new Coin();
         Coin c2 = new Coin();
         Coin c3 = new Coin();
         System.out.println("P1 = " + c1.toString() + " p2 = " + c2.toString() + " p3 = " + c3.toString());
         if ((c1.getvalue() == c2.getvalue()) && (c1.getvalue()) == c3.getvalue()) {
            tie++;
         } else if (c2.getvalue() == c3.getvalue()) {
            pl1++;
         } else if (c1.getvalue() == c3.getvalue()) {
            pl2++;
         } else {
            pl3++;
         }
         i++;
      }
      System.out.println("\nP1 Wins : " + pl1 + "\nP2 wins : " + pl2 + "\nP3 wins : " + pl3);
      System.out.println("\ntie : " + tie);

   }

}

/*
======================
OUTPUT
======================
 * javac -d . Task2.java
 * java task2.Task2
 * 
 * 
 * Let's play a coin toss game !
 * Please enter player 1 :
 * a
 * Please enter player 2 :
 * b
 * Please enter player 2 :
 * c
 * a
 * b
 * c
 * How many Tosses ?
 * 7
 * P1 = Tails p2 = Tails p3 = Heads
 * P1 = Heads p2 = Heads p3 = Heads
 * P1 = Heads p2 = Tails p3 = Tails
 * P1 = Heads p2 = Tails p3 = Tails
 * P1 = Heads p2 = Tails p3 = Tails
 * P1 = Heads p2 = Heads p3 = Tails
 * P1 = Heads p2 = Heads p3 = Tails
 * 
 * P1 Wins : 3
 * P2 wins : 0
 * P3 wins : 3
 * 
 * tie : 1
 * 
 */
