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
public class LambdaApp3
{
    public static void main(String [] args )
    {
        //1.
        // Cab cab = new UberX(); // polymorphic Statement
        // cab.bookCab();

        //2.
        // anonymous Class Implementation
        Cab cab = new Cab()
        {
            @Override 
            public void bookCab()
            {
        System.out.println("UberX Booked || Arriving Soon || ");
                
            }
        };
        cab.bookCab();
    }
}


/*
javac -d . LambdaApp3.java
java One6_4.LambdaApp3

UberX Booked || Arriving Soon || 
*/
