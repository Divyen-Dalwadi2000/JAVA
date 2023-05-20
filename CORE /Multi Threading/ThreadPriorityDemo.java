package threads;

public class ThreadPriorityDemo {

  public static void main(String[] args) {
    MyThread t = new MyThread();
    t.start();
    System.out.println("The priority of Main Thread : "+ Thread.currentThread().getPriority()); // default main thread priority is "5"
    t.setPriority(8);                 // set child thread priority as "8"
    System.out.println("The priority of Child Thread : "+ t.getPriority()); // 8 => child thread priority
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread");
    }
  }
}

class MyThread extends Thread {

  public void run() {
    for (int j = 0; j < 10; j++) {
      System.out.println("child Thread");
    }
  }
}


// javac -d . ThreadPriorityDemo.java
// java threads.ThreadPriorityDemo

// the output for the above program we can't expact exact output

// but if uncomment the "t.setPriority(8);" line than we get exact output like
// bcz we set the child thread priority as "8" which is highest then main thread "5"
// child Thread
// child Thread
// child Thread
// child Thread
// child Thread
// child Thread
// child Thread
// child Thread
// child Thread
// child Thread
// The priority of Main Thread : 5
// The priority of Child Thread : 8
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread