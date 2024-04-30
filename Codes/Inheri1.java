
class human{
    int age;
    public void sleep()
    {
        age = 20;
        System.out.println("Human need sleep");
        System.out.println(age);
    }
}
class Student extends human
{

}

public class Inheri1 {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.sleep();
    }
    
}
