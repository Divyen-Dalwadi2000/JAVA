//1. W.A. P for Removing leading and railing whitespaces in a string (Hint : Use trim() and equals() to process commands.)
public class stringclass1 {
    public static void main(String[] args) {
        String s1 = "  Hello World!  ";
        String s2 = "Hello World!";
       
		// String s3 = "Hello World!";
	   
	   
        String s = s1.trim();
        System.out.println(s2.equals(s)); // true 
		
    }
}
