
class a{

    public void show(){
        System.out.println("in show");
    }

    class b{ // inner class
        public void disp(){
            System.out.println("in disp");
        }
    }
}

public class inner1 {

    public static void main(String[] args) {
        a obj = new a();   // object of outer class reference for inner class
        a.b obj1 = obj.new b();    // object of inner class
        obj.show(); // calling outer class method
        obj1.disp(); //calling inner class method
    }
    
}
