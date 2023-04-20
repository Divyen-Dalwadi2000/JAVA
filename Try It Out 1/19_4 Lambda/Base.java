package One6_4;
@FunctionalInterface
interface displayable
{
    void display(String msg);
}

public class Base implements displayable
{
    public void display(String msg)
    {
        System.out.println(msg);
    }
    public static void main(String [] args ) 
    {
        Base dis = new Base();
        dis.display("Welcome McaII to Launch Lambda Expression");

    }
}

/*
 javac -d . Base.java
 java One6_4.Base      

 
Welcome McaII to Launch Lambda Expression

*/
