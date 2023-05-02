
//3. W. A. P for Joining strings with delimiter (Note: JDK 8 adds a new method to String called join( ). It is used to concatenate two or more
// strings, separating each string with a delimiter, such as a space or a comma. Demonstrate the join() method defined by String.
public class Stringclass3 {
    public static void main(String[] args) {
        String S1 = "Hello !";
        String S2 = "I am Meet ";
       String M = String.join(" ",S1,S2);
       System.out.println(M);
    }
}
