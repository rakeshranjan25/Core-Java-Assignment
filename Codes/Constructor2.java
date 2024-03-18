class student{

private String name;
private int age;

public student(){
    System.out.println("Default Constactor Called");
    name = "Rohan";
    age = 18;
}

public student(String name, int age ){
 this.name=name;
 this.age=age;
}

public void dish(){
    System.out.println(name);
    System.out.println(age);
}

}

public class Constructor2 {
    
    public static void main(String[] args) {
        student st = new student();
        st.dish();

        student st1 = new student("Rahul", 18);
        st1.dish();
    }

}


// codes