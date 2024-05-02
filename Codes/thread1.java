public class thread1 {
    public static void main(String[] args) {
        System.out.println("Thread Information");
        System.out.println("Before Changing");
        String name = Thread.currentThread().getName(); // get the name of current thread
        System.out.println( "Name of current thread : " + name); // Print the name of current thread
        System.out.println("Thread Priority is : " + Thread.currentThread().getPriority()); // get the priority of current thread

        System.out.println("After Changing");
        Thread t = Thread.currentThread();  // get the current thread
        t.setName("MPSEDC");    // set the name of current thread
        t.setPriority(1);      // set the priority of current thread

        String name1 = Thread.currentThread().getName();    // get the name of current thread
        System.out.println( "Name of current thread : " + name1); // Print the name of current thread
        System.out.println("Thread Priority is : " + Thread.currentThread().getPriority()); // get the priority of current thread
    }
    
}
