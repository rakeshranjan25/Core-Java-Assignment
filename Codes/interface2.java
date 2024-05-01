
interface computer{
    void compile();
}

class laptop implements computer{
    public void compile(){
        System.out.println("Compiling error 5");
    }
}

class desktop implements computer{
    public void compile(){
        System.out.println("Compiling error 5, faster");
    }
}

class developer{
    public void build(computer obj){
        System.out.println("build application");
        obj.compile();
    }
}


public class interface2 {
    public static void main(String[] args) {
        computer obj = new desktop();
        developer dev = new developer();
        dev.build(obj);
    }
    
}
