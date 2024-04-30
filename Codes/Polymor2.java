class AeroPlane
{
    public void carry()
    {
        System.out.println("AeroPlane is Carrying passengers and goods");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
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

class Airport{
    public void poly ( AeroPlane ref){
        ref.carry();
        ref.fly();
        System.out.println("-----------------------------------");
}
}


public class Polymor2
{
    public static void main(String[] args) 
    {
        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        // AeroPlane ref;
        // ref=cp;
        // ref.takeOff();
        // ref.fly();

        // ref=pp;
        // ref.takeOff();
        // ref.fly();

        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
    }
}