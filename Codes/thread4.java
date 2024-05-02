import java.util.*;

class Calc implements Runnable {

    public void run() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second num : ");
        int num2 = sc.nextInt();

        System.out.println("Addition is : " + (num1 + num2));
        sc.close();
        System.out.println("Calculation is done");
    }
}

class MyThread implements Runnable {

    public void run() {
try
{
    for (int i = 0; i < 5; i++) {
        System.out.println("Child Thread");
        Thread.sleep(2000);
    }
}
catch(Exception e)
{
    System.out.println("Some Problem");
}

    }
}

public class thread4 {
    public static void main(String[] args) {

        Calc c = new Calc();
        MyThread m = new MyThread();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(m);

        t1.start();
        t2.start();
        
    }
    
}
