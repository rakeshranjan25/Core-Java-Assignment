
class demo1{

    void disp(){
        System.out.println("disp demo1");
    }
}

class demo2 extends demo1{
}

class demo3 extends demo2{
}


public class Inheri3 {

    public static void main(String[] args) {
        demo3 obj = new demo3();
        obj.disp();
    }
    
}
