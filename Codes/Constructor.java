
class Student {

    private int age;
    private String name;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class Constructor { 
    public static void main(String[] args) {
        Student obj = new Student("Rahul", 18);

        int stud1age = obj.getAge();
        String stud1Name = obj.getName();
        
        System.out.println(stud1Name);
        System.out.println(stud1age);
    }
}

