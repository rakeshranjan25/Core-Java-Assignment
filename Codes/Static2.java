

    class demo{
        static int a;
        static int b;

        int m;
        int n;

        static{
            a =10;
            b =20;
            System.out.println("control in static");
        }

        {
            m = 100;
            n = 200;
            System.out.println("control in non static");
        }

        static void disp1(){
            System.out.println("value of static var " + a);
            System.out.println("value of static var " + b);
        }

        void disp2(){
            System.out.println("value of instance var " + m);
            System.out.println("value of instance var " + n);
        }
    }

    public class Static2 {
    public static void main(String[] args) {
        demo d = new demo();
        demo.disp1();
        d.disp2();
    }
    
}
