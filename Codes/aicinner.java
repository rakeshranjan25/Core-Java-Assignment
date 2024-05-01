interface car {
    void drive();
}

public class aicinner {

    public static void main(String[] args) {

        car obj = new car() // interface object using anonymous inner class
        {   // anonymous inner class
            public void drive() {  // declaring method inside anonymous inner class
                System.out.println("Driving ..");
            }
        };

        obj.drive(); // calling inner class method
    }
    
}
