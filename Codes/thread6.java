class Printing implements Runnable{

    public void run() {
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
public class thread6 {
    public static void main(String[] args) throws Exception
    
    {
        System.out.println("Main Thread Started");
        Printing p = new Printing();
        Thread t = new Thread(p);
        System.out.println(t.isAlive()); //false
        t.start();
        System.out.println(t.isAlive()); //true
        t.join();
        System.out.println("Main Thread Ended");
    }
    
}
