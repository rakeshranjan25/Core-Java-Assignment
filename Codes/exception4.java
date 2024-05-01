
class demo {

    public void a () throws Exception
    {
        b();
    }
    public void b () throws Exception
    {
        int num1 = 10;
        int num2 = 0;

        int result = num1 / num2;
        System.out.println("result is : " + result);
    }
}

public class exception4 {

    public static void main(String[] args) {
        demo obj = new demo();
        try
        {
            obj.a();
        }
        catch(Exception e) // Handle the exception
        {
            System.out.println("Something went wrong" + e);
        }
    }
}
