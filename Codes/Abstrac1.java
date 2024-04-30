
abstract class AeroPlane
{
    abstract public void carry();
    abstract public void fly();
    
    public void land()
    {
        System.out.println("Aeroplane lands on runway");
    }

}

class CargoPlane extends AeroPlane
{
    public void carry()
    {
        System.out.println("CargoPlane carries goods");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }

   public void alert() //specialized method for CargoPlane
   {
       System.out.println("Alert on CargoPlane");
   }

}
class PassengerPlane extends AeroPlane
{
    public void carry()
    {
        System.out.println("PassengerPlane carries passenger");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }

}

public class Abstrac1 {

    public static void main(String[] args) {
        AeroPlane ref1 = new CargoPlane();
        AeroPlane ref2 = new PassengerPlane();

        ref1.carry();
        ref1.fly();
        ref1.land();
        ((CargoPlane) ref1).alert();  //downcasting

        System.out.println("-----------------------------------");

        ref2.carry();
        ref2.fly();
        ref2.land();
    }
    
}
