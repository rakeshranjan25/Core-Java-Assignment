import java.util.*;

public class exception2 {
    
    public static void main(String[] args) {
        
        int num = 0;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        try
        {
            num = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a number");
            System.out.println(e);
        }
        finally
        {
            sc.close();
        }
        System.out.println("Number is : " + num);
    }
}
