
class human{

    human(){
        System.out.println("Human Constructor");
    }

    int age;
    void sleep()
    {
        age = 20;
        System.out.println("Human need sleep");
        System.out.println(age);
    }
}
class Student extends human
{
    void disp(){
        System.out.println("Age is :" + age);
    }

}

public class Inheri2{
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.sleep();
        st1.disp();
    }
    
}
