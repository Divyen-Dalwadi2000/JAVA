// The following program with exception handling mechanism shows how...abstract
/*
package p2;


public class Demonstration_105 
{

public static void main(String [] args)
   {
    int number , InvalidCount = 0 , validCount = 0 ;
    for (int i = 0; i < args.length; i++) {
        try {
            number = Integer.parseInt(args[i]);
        } catch (NumberFormatException e) {
            InvalidCount++;
            System.out.println("Invalid Number at " + i + " " + args[i]);
        }
        validCount++;
        System.out.println("valid Number at " + i + " " + args[i]);
    }
System.out.println("Invalid entries : at " + InvalidCount);
System.out.println("Invalid entries : at " + validCount);
      
   }

}

*/

/*
 
====================================================================
output with different argument there is somethin grong in the code 
====================================================================
D:\##MCA##\sem2\java\Trry It Out 2>java p2.Demonstration_105 1 2 3 4
valid Number at 0 1
valid Number at 1 2
valid Number at 2 3
valid Number at 3 4
Invalid entries : at 0
Invalid entries : at 4

D:\##MCA##\sem2\java\Trry It Out 2>java p2.Demonstration_105 a b cd e
Invalid Number at 0 a
valid Number at 0 a
Invalid Number at 1 b
valid Number at 1 b
Invalid Number at 2 cd
valid Number at 2 cd
Invalid Number at 3 e
valid Number at 3 e
Invalid entries : at 4
Invalid entries : at 4
*/



// ====================
// The Chaged code 
// ====================


package p2;

public class Demonstration_105 {

    public static void main(String[] args) {
        int number, invalidCount = 0, validCount = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                number = Integer.parseInt(args[i]);
                validCount++;
                System.out.println("Valid Number at " + i + ": " + args[i]);
            } catch (NumberFormatException e) {
                invalidCount++;
                System.out.println("Invalid Number at " + i + ": " + args[i]);
            }
        }
        System.out.println("Invalid entries: " + invalidCount);
        System.out.println("Valid entries: " + validCount);
    }

}


// ====================
// Output
// ====================
// D:\##MCA##\sem2\java\Trry It Out 2>java p2.Demonstration_105 1 2 3 4
// Valid Number at 0: 1
// Valid Number at 1: 2
// Valid Number at 2: 3
// Valid Number at 3: 4
// Invalid entries: 0
// Valid entries: 4

// D:\##MCA##\sem2\java\Trry It Out 2>java p2.Demonstration_105 a b cd e
// Invalid Number at 0: a
// Invalid Number at 1: b
// Invalid Number at 2: cd
// Invalid Number at 3: e
// Invalid entries: 4
// Valid entries: 0