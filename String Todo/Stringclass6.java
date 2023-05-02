//6. Demonstrate string modification(delete() and deletecharAt()), replace (replace()), substring (indexOf(), lastindexOf())
// and hashcode of a string

public class Stringclass6 {
    public static void main(String[] args) {
        String S1 = "Hello World !";
        StringBuilder s2= new StringBuilder("Hello World 1!");
        // String Functions
        System.out.println(S1.indexOf("o"));
        System.out.println(S1.lastIndexOf("o"));
        System.out.println(S1.charAt(0));
        System.out.println(S1.replace("o", "A"));
        // hash code
        int h = S1.hashCode();
        System.out.println(h);

        // String Functions




        s2.deleteCharAt(1);
        String a = s2.toString();
        System.out.println("after delete char at " + a);


//        String M =String.valueOf(s2.delete(5,8));
//        s2.delete(5,8);
        s2.delete(5,11);
        String M =s2.toString();
        System.out.println("After delete " + M);

//        System.out.println(S1.substring("H"));

    }
}
