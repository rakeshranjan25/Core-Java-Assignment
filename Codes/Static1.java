public class Static1 {

    static int age;

    static{
        age = 18;
        System.out.println("static first");
        System.out.println(age);
    }

    static void disp(){
        System.out.println("after main string");
    }

    public static void main(String[] args) {
        System.out.println("after static");

        disp();
    }
    
}
