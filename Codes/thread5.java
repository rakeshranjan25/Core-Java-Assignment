import java.util.*;

class MyThread extends Thread{ // Thread class is extended
    
    public void run() 
    {
        String name1 = Thread.currentThread().getName(); // get the name of the current thread
        if (name1.equals("calc")) { // check if the name of the current thread is "calc"
            calc(); // call the calc() method
        }
        else{
            disp(); // call the disp() method
        }
    }

    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second num : ");
        int num2 = sc.nextInt();

        System.out.println("Addition is : " + (num1 + num2));
        sc.close();
        System.out.println("Calculation is done");
    }

    public void disp(){
        try
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Important Message");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some Problem");
        }

    }
}


public class thread5 {
    public static void main(String[] args) {

        MyThread m1 = new MyThread(); // create an object of MyThread
        MyThread m2 = new MyThread(); // create another object of MyThread

        m1.setName("calc"); // set the name of the first thread as "calc"
        m2.setName("disp"); // set the name of the second thread as "disp"

        m1.start(); // start the first thread
        m2.start(); // start the second thread
    }
    
}
