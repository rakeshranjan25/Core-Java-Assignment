
class car implements Runnable{

    public void run(){ 
        try{
            System.out.println(Thread.currentThread().getName() + " is come to parking lot");
            Thread.sleep(2000);

            synchronized(this) //synchronized block
            {
            System.out.println(Thread.currentThread().getName() + " sreaching the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " car started and moving");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " come back and park the car");
            Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Some Problem");
        }
    }
}

public class thread7 {

    public static void main(String[] args) {

        car c = new car(); //Runnable object
        Thread t1 = new Thread(c); //Thread object
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Rakesh"); //setting name of thread
        t2.setName("Ayushman");
        t3.setName("Atul");

        t1.start(); //starting thread
        t2.start();
        t3.start();

    }
    
}
