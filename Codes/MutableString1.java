public class MutableString1 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Bhopal");
        System.out.println(str);

        str.append(" City");
        System.out.println(str);
    }
}
