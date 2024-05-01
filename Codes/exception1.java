
public class exception1 {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        try
        {
            result = num1 / num2;
            System.out.println("in try block");
        } 
        catch(Exception e)
        {
            System.out.println("Somthing went wrong " + e);
        }

        System.out.println("Result is : " + result);
        System.out.println("bye bye");
    }
}
