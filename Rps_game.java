/*

Rock , paper , scissor game  

scissors beats paper
paper beats rock 
rock beats scissors 

==========================
R = 0 ,P = 1 ,S = 2
S > P | 
P > R |
R > S |

==========================

*/
package game;
import java.util.Random;
import java.util.Scanner;

public class Rps_game {

  // ===========================DISPLAY MENU==========================
  public static void displayMenu() {
    System.out.println(
      " 1) Rock \n 2) Paper \n 3) Scissor \n ======================================== "
    );
  }

  // ===========================COMPUTER CHOICE==========================
  public static String randomComputerChoice(Random p1) {
    int p1_move = p1.nextInt(3);
    String computer_choice = "";

    if (p1_move == 0) {
      computer_choice = "Rock";
    } else if (p1_move == 1) {
      computer_choice = "Paper";
    } else if (p1_move == 2) {
      computer_choice = "Scissor";
    }
    return computer_choice;
  }

  // ===========================USER CHOICE==========================
  public static String user_choice(Scanner p2) {
    System.out.print("Enter The User move :");
    String p2_move = p2.nextLine();

    return p2_move;
  }

  public static String winner(String c_choice, String u_choice) {
    String winner = " no winner" ;
    String customMessage  = "Both Choose same " ;
    String Final = "" ;

    String rockCustomMessage = "The Rock Smashes the scissor ";
    String scissorCustomMessage = "scissor cuts the paper ";
    String paperCustomMessage = "paper wraps rock ";
//-----------------------------------------------------------------------------
    if (c_choice.equals("Rock") && u_choice.equalsIgnoreCase("scissor")) {
    winner = "computer ";
    customMessage = rockCustomMessage;
    }else if (c_choice.equals("Scissor") && u_choice.equalsIgnoreCase("Rock"))
    {
      winner = "user";
      customMessage = rockCustomMessage;
    }
//-----------------------------------------------------------------------------
if(c_choice.equals("Paper") && u_choice.equalsIgnoreCase("Rock"))
{
  winner = " computer " ;
  customMessage = paperCustomMessage;
}
else if(c_choice.equals("Rock") && u_choice.equalsIgnoreCase("paper"))
{
  winner = " user ";
  customMessage = paperCustomMessage;
}
//-----------------------------------------------------------------------------
if(c_choice.equals("Scissor") && u_choice.equalsIgnoreCase("Paper"))
{
  winner =  "computer" ;
  customMessage = scissorCustomMessage; 
}
else if(c_choice.equals("Paper") &&  u_choice.equalsIgnoreCase("Scissor"))
{
  winner = " user";
  customMessage = scissorCustomMessage ;
}
    Final = winner +  " won ( "  + customMessage + " ) " ;

    return Final ;
  }

  //=================================================================
  // ===========================MAIN MENU============================
  //=================================================================

  public static void main(String args[]) {
    Random p1 = new Random();
    Scanner p2 = new Scanner(System.in);
    

    //function call
    displayMenu();
    String computer_choice = randomComputerChoice(p1);
    String user_choice = user_choice(p2);
    String win = winner(computer_choice, user_choice);

    System.out.println("\n you choose : " + user_choice + "\n computer choose : " + computer_choice );
    System.out.println(win);
  }
}

/*
========
OUTPUT
========
 1) Rock
 2) Paper
 3) Scissor
 ========================================
Enter The User move :rock

 you choose : rock
 computer choose : Scissor
user won ( The Rock Smashes the scissor  )


*/