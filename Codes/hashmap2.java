import java.util.*;

public class hashmap2 {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Rakesh");
        map.put(2, "Atul");
        map.put(3, "Ayushman");
        map.put(4, "Akash");

        Set keySet = map.keySet();
        Iterator itr = keySet.iterator();
        while(itr.hasNext()) {
            Integer key = (Integer)itr.next();
            System.out.println(key);
        }

        Collection values = map.values();
        Iterator itr1 = values.iterator();
        while(itr1.hasNext()) {
            String value = (String)itr1.next();
            System.out.println(value);
        }

        Set entrySet = map.entrySet();
        Iterator itr2 = entrySet.iterator();
        while(itr2.hasNext()) {
            Map.Entry entry = (Map.Entry)itr2.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
}
