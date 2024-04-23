import java.util.Scanner;

public class Firstcode {

    public static void main(String[] args) {
        int age ;
        System.out.print("Enter your age : ");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();

        System.out.println("your age is : " + age);
        scan.close();
    }
}
