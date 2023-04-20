package One6_4;
@FunctionalInterface
interface Cab
{
    // when an interface will have exactly 1 abstract method we can say it as a Functional Interface
    void bookCab(); // -> by default public abstract void bookCab();
}

// class UberX implements Cab{
//     public void bookCab()
//     {
//         System.out.println("UberX Booked || Arriving Soon || ");

//     }

// }
public class LambdaApp2
{
    public static void main(String [] args )
    {
        //1.
        Cab cab = new UberX(); // polymorphic Statement
        cab.bookCab();

    }
}


/*
javac -d . LambdaApp.java
javac -d . LambdaApp2.java
java One6_4.LambdaApp2


UberX Booked || Arriving Soon || 

*/

// without creating / compile the lambdaApp.java
/*
javac -d . LambdaApp2.java

LambdaApp2.java:22: error: cannot find symbol
        Cab cab = new UberX(); // polymorphic Statement
                      ^
  symbol:   class UberX
  location: class LambdaApp2
  */