public class Rev {
    public static void main(String[] args) {

        String a = " Hello !";
        String b = "";
        int l = a.length();

        System.out.println("Before Reverse : " + a);
        for(int i=l-1 ; i >= 0; i--)
        {
//          a=a+a.charAt(i);
            b=b+a.charAt(i);
        }
//        System.out.println("After Reverse : " + a);
        System.out.println("After Reverse : " + b);
    }

}


// Before Reverse :  Hello !
// After Reverse  : ! olleH
