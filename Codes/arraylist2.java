import java.util.*;

public class arraylist2 {
    public static void main(String[] args) {
        
        ArrayList a1 = new ArrayList();

        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(400);

        Iterator itr = a1.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
