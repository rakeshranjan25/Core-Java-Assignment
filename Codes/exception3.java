import java.util.*;

public class exception3 {
    public static void main(String[] args) {
        int num = 0;

        try(Scanner sc = new Scanner(System.in)) // try with resources 
        {
            System.out.print("Enter a number : ");
            num = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a Number");
            System.out.println(e);
        }

        System.out.println("Number is : " + num);
    }
}