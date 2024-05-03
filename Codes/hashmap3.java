import java.util.*;
import java.util.Map.*;

class student {
    private String name; //private data members
    private int age;
    private String city;

    public student(String name, int age, String city) { // Constructor
        this.name = name; // this keyword is used to refer to the current object
        this.age = age;
        this.city = city;
    }

    public String getName() {  // Getter methods
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString() {  // Overriding toString() method
        return name + " : " + age + " : " + city;
    }

}

public class hashmap3 {
    public static void main(String[] args) {
        student s1 = new student("Rakesh", 23, "Bhopal"); // Creating objects and assigning values
        student s2 = new student("Atul", 22, "Chindwara");
        student s3 = new student("Ayushman", 23, "Indore");
        student s4 = new student("Akash", 24, "Noida");

        Map map = new HashMap(); // Creating HashMap object

        map.put(1, s1); // Adding objects to HashMap
        map.put(2, s2);
        map.put(3, s3);
        map.put(4, s4);

        Set set = map.entrySet(); // Getting entry set of HashMap object
        Iterator itr = set.iterator(); // Getting iterator object
        while (itr.hasNext()) { // Traversing HashMap object
            Map.Entry data = (Map.Entry) itr.next(); // Getting key-value pair
            System.out.println(data.getKey() + " : " + data.getValue()); // Printing key and value
        }
    }
}
