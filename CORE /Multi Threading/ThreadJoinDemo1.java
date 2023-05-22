package Thread;

class MyThread extends Thread {

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child Thread");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {}
    }
  }
}

public class ThreadJoinDemo1 {

  public static void main(String[] args) throws InterruptedException {
    MyThread t = new MyThread();
    t.start();
    // t.join();                // execute after the Child Thread is done their execute
    t.join(10000);              // execute if after 10 second(10000 ms) the child thread execute 
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread");
    }
  }
}
