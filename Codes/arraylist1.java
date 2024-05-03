import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        
        ArrayList a11 = new ArrayList();

        a11.add(11);
        a11.add(2);
        a11.add(9);
        a11.add(5);

        ArrayList a12 = new ArrayList();

        a12.add("Hello");
        a12.add("MPSEDC");
        a12.add("IT Center");
        a12.add("Bhopal");

        ArrayList a13 = new ArrayList();

        a13.add(5.02);
        a13.add("Rakesh");
        a13.add(2024);
        a13.add(true);

        ArrayList a14 = new ArrayList();

        a14.add("Test");
        a14.addAll(a11);
        a14.addAll(a12);
        a14.addAll(a13);

        System.out.println(a14);
    }

}
