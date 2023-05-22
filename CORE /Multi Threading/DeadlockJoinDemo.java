package Deadlock;

class MyThread extends Thread {

  static Thread mt;

  public void run() {
    try {
      mt.join();
    } catch (InterruptedException e) {}
    for (int i = 0; i < 10; i++) {
      System.out.println("Child Thread");
    }
  }
}

public class DeadlockJoinDemo {

  public static void main(String[] args) throws InterruptedException {
    MyThread.mt = Thread.currentThread();
    MyThread t = new MyThread();
    t.start();
    t.join();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread");
    }
  }
}



// ===============
// Output
// ===============
// here the both  main and child Thread are in stucked 
// bcz of both are waiting for each other 

// javac -d . DeadlockJoinDemo.java
// java Deadlock.DeadlockJoinDemo
