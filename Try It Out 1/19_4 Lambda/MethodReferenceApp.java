package One6_4;

interface Calculator
{
    void add(int num1, int num2);
}
class Calc
{
    public static void addSomething(int num1 , int num2)
    {
        System.out.println(num1 + " and " + num2 + " addition is : " + (num1+num2));
    }
    public void letsAdd(int num1 , int num2)
    {
        System.out.println(num1 + " and " + num2 + " adds to : " + (num1+num2));

    }
}

public class MethodReferenceApp
{
    public static void main(String [] abc)
    {
        // Calc.addSomething(10,20);
        
        // 1. Reference to a Static Methoid 
        // Calculator cRef = Calc::addSomething; // Method Reference 
        // cRef.add(11,14);

        /*
    ==========================
    OUTPUT
    ==========================
    11 and 14 addition is : 25
    */

    // Reference to a non static method or Instance Method 
    // Object Construction Statement for Calc

    Calc calc = new Calc() ;
    Calculator cRef = calc::letsAdd;    // Method Reference 
    cRef.add(122,13);

     /*
    ==========================
    OUTPUT
    ==========================
    122 and 13 adds to : 135
    */
    }
}

/*

 javac -d . .\MethodReferenceApp.java
 java One6_4.MethodReferenceApp      


*/