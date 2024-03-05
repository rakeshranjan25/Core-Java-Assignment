import java.util.Scanner;

class Farmer{

    int pa;
    float td;
    static float ri;
    float si;

    void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the loan amount you want : ");
        pa = sc.nextInt();
        System.out.print("Enter the time duration : ");
        td = sc.nextFloat();
        sc.close();
    }

    static{
        ri = 8.5f;
    }

    void count(){
        si = (pa*td*ri)/100f;
    }

    void disp(){
        System.out.print("Simple interest is : " + si);
        System.out.println();
        System.out.println();
    }
}

public class Static3 {

    public static void main(String[] args) {
        
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
    
        f1.enter();
        f1.count();
        f1.disp();

        f2.enter();
        f2.count();
        f2.disp();
    }
}
