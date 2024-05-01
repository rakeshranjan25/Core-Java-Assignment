import java.lang.FunctionalInterface;

@FunctionalInterface
interface car{
    void drive(int avg, int topSpeed);
}


public class lambda1 {
    public static void main(String[] args) {
        // lambda expression and functional interface declaration
        car obj = (avg, topSpeed) -> System.out.println("Driving .. Avg speed: " + avg + " Top speed: " + topSpeed);
        //calling lambda expression
        obj.drive(40, 120);

        //short code using lambda expression
    }
}
