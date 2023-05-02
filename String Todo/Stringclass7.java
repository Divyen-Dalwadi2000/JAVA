//7. String to other forms : Methods toBinaryString( ), toHexString( ), and toOctalString( ),
// which convert a value into a binary, hexadecimal, or octal string, respectively. W.A. P to demonstrate binary, hexadecimal, and octal conversion.
public class Stringclass7 {
    public static void main(String[] args) {
        int a = 42 ;

        String b = Integer.toBinaryString(a);
        System.out.println(b);

        String c = Integer.toHexString(a);
        System.out.println(c);

        String d = Integer.toOctalString(a);
        System.out.println(d);

    }
}
