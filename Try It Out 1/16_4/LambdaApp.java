package One6_4;
@FunctionalInterface
interface Cab
{
    // when an interface will have exactly 1 abstract method we can say it as a Functional Interface
    void bookCab(); // -> by default public abstract void bookCab();
}

class UberX implements Cab{
    public void bookCab()
    {
        System.out.println("UberX Booked || Arriving Soon || ");

    }

}
public class LambdaApp
{
    public static void main(String [] args )
    {
    Cab cab = new UberX();
    cab.bookCab();
    }
}

/*
javac -d . LambdaApp.java
java One6_4.LambdaApp


UberX Booked || Arriving Soon || 

*/