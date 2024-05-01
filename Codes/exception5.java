
class MyException extends Exception  // Create a custom exception
{
    public MyException(){}

    public MyException(String msg)
    {
        super(msg); // Call the constructor of the parent class (Exception)
    }
}

public class exception5 {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = -2; // Change the value to negative number for error

        try
        {
            if (num2<0)
            {
            Exception e = new MyException("Negative number not allowed"); // Throw the custom exception
            throw e;   
            }
            else
            {
                int result = num1/num2;
                System.out.println("result is : " + result);
            }
        }
        catch(Exception e) // Handle the exception
        {
            System.out.println("Enter the valid Number" + e);
        }

    }
}
