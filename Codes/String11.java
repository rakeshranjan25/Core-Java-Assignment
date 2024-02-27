public class String11 {
    public static void main(String[] args) {
        String str1= "MADAM";
        String str2 = "";

        for(int i = str1.length()-1; i>=0; i--){
            str2 = str2+str1.charAt(i);
        }
        System.out.println("Befor: " + str1);
        System.out.println("After Reverse: " + str2);

        System.out.println();

        if (str1.equals(str2)) {
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Given string is not palindrome");
        }
    }
}
