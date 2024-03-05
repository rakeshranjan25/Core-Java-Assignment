class Student {
    private int age;
    private String name;

    public void setData1(int age){
        this.age=age;
    }

    public void setData2(String name){
        this.name=name;
    }

    public void show(){
        System.out.println(name + " " + age);
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.setData1(18);
        obj2.setData1(23);

        obj1.setData2("Navin");
        obj2.setData2("Kiran");

        obj1.show();
        obj2.show();
    }
}
