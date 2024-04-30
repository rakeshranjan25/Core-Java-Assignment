class AeroPlane
{
    public void takeOff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}

class CargoPlane extends AeroPlane
{
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }
    public void carryGoods()
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends AeroPlane
{
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger()
    {
        System.out.println("PassengerPlane carries passenger");
    }

}
public class Polymor1
{
    public static void main(String[] args) 
    {
        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        AeroPlane ref;
        ref=cp;
        ref.takeOff();
        ref.fly();

        ref=pp;
        ref.takeOff();
        ref.fly();
        
    }
}