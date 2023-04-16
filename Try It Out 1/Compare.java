package pack;

public class Compare {

  int num1, num2;

  public Compare(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public void getmax() {
    if (num1 > num2) {
      System.out.println("maximum value of two number is : " + num1);
    } else {
      System.out.println("maximum value of two number is : " + num2);
    }
  }


  public static void main(String[] args) {
    Compare a[] = new Compare[3];
    a[1] = new Compare(5, 10);
    a[2] = new Compare(123, 120);

    for (int i = 1; i < 3; i++) {
      a[i].getmax();
    }
  }
}

/*
 =========
 Output
 =========
maximum value of two number is : 10
maximum value of two number is : 123
 */