class Student{
    private int age;
    private String name;

    public void setData(){
        age = 18;
        name = "Bhojpal";
    }

    public void show(){
        System.out.println(name + " " + age);
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData();
        obj.show();
    }
}
