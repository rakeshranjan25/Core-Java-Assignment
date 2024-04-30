
class demo1 {
    int a,b;
    
    public demo1(){
        System.out.println("perent class constructor demo1");
    }

    public demo1(int x, int y){
        System.out.println("perent parameterized class constructor demo1");
        a=x;
        b=y;
    }
}

class demo2 extends demo1{
    int c,d;
    
    public demo2(){
        this(10, 20);
        System.out.println("child class constructor demo2");
    }

    public demo2(int x, int y){
        System.out.println("child parameterized class constructor demo2");
        c=x;
        d=y;
    }
}

public class Inheri5 {

    public static void main(String[] args) {
        //demo2 obj = new demo2();  //remove comment to see the output
    }
    
}
