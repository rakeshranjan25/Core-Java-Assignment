
class aniaml //extends object
{  
    void disp(){
        System.out.println("Animal need sleep");
    }
}

class tiger extends aniaml{
    void show(){
        System.out.println("Tiger need food");
    }
}

class cat extends tiger{
    void show(){
        System.out.println("Cat need milk");
    }
}

public class Inheri4 {

    public static void main(String[] args) {
        tiger t = new tiger();
        cat c = new cat();
        t.show();
        t.disp();
        c.show();
        c.disp();
    }
    
}
