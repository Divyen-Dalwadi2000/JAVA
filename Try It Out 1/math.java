package pack;

public class math {

  public static void main(String[] args) {
    double val = 64.6445688;

    double sqrroot = Math.sqrt(val);
    System.out.printf("Sq. root of %f is %.2f \n", val, sqrroot);

    double abs_val = Math.abs(val);
    System.out.printf("Absolute value of %f is %.2f \n", val, abs_val);

    double ceil_val = Math.ceil(val);
    System.out.printf("Ceil value of %f is %.2f \n", val, ceil_val);

    double floor_val = Math.floor(val);
    System.out.printf("Floor value of %f is %.2f \n", val, floor_val);
    //------------------------------------------------------------------------
    double base = 25.0;
    double exponent = 2.0;
    double power = Math.pow(base,exponent);
    System.out.printf("Power of %f 's %f is =  %.2f \n", base,exponent, power);
    //------------------------------------------------------------------------
    double rand_val = Math.random(); // random value is between 0.0 (inclusive) and 1.0(exclusive)
    System.out.printf("The random value is  %.2f \n" , rand_val);
    //------------------------------------------------------------------------
    // explicit conversion of random value 
    // int  rand_val2 = (int)(Math.random()); // it returns only 0
    
    // below we take min= 1 , max < 100+1
    int  rand_val2 = (int)(Math.random() * 100 + 1); // random value is between 1 (inclusive) and 101 (exclusive)
    System.out.printf("The Integer random value is  %d \n" , rand_val2);
    //------------------------------------------------------------------------

  }
}
/*
 =========
 Output
 =========
Sq. root of 64.644569 is 8.04
Absolute value of 64.644569 is 64.64
Ceil value of 64.644569 is 65.00
Floor value of 64.644569 is 64.00
Power of 25.000000 's 2.000000 is =  625.00
The random value is  0.82
The Integer random value is  2
 */
