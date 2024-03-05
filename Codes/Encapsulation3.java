
class Student {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation3 { 
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setAge(18);
        obj.setName("Navin");

        int stud1age = obj.getAge();
        String stud1Name = obj.getName();
        
        System.out.println(stud1Name);
        System.out.println(stud1age);
    }
}
