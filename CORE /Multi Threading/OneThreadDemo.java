// every java program contain one Threadd (main)

package threads;
class MyThread extends Thread {

  public void run() {
    // Executed by child thread
    for (int i = 0; i < 10; i++) {
      System.out.println("Child Thread");
    }
  }
}

public class OneThreadDemo {

  public static void main(String[] args) {
    MyThread a = new MyThread(); // main thread creates a child thread object
    a.start();                   // main thread start child thread
    
    // Executed by main thread
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread");
    }
  }
}
