class MyThread extends Thread { // Thread class is extended to create a thread
    public void run() { //create run method for thread to execute
        System.out.println("Child Thread");
    }
}

public class thread2 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        MyThread t = new MyThread(); // create a thread
        t.start();  // start the thread call run method
    }
    
}
