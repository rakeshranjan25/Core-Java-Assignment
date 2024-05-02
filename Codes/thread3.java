import java.util.*;

class Calc extends Thread {

    public void run() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second num : ");
        int num2 = sc.nextInt();

        System.out.println("Addition is : " + (num1 + num2));
        sc.close();
    }
}

class MyThread extends Thread {

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

public class thread3 {
    public static void main(String[] args) {

        Calc c = new Calc();
        MyThread t = new MyThread();

        c.start();
        t.start();
        
    }
    
}
