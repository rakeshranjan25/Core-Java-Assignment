public class MutableString2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Virat");
        sb.append(" Kohli");
        System.out.println(sb);

        sb = new StringBuffer("Sachin");
        System.out.println(sb);

        //use final keyword

        final StringBuffer sb2 = new StringBuffer("Bhopal");
        sb2.append(" City");
        System.out.println(sb2);

        // sb2 = new StringBuffer("Indore");  final keyword doe'nt change object referance
    }
}
