abstract class Car
{
    //abstract methods can only be written in abstract class
    public abstract void drive();
    public abstract void playmusic();
}
class ToyotaFortuner extends Car
{
    @Override
    public void playmusic() 
    {
        System.out.println("Playing music in fortuner");
    }

    @Override
    public void drive() 
    {
        System.out.println("Driving fortuner");
    }
}
public class Abstract 
{
    public static void main(String[] args)
    {
        //For abstract classes we cannot create an object
        //we can create objects only for inherited classes
        ToyotaFortuner obj = new ToyotaFortuner();
        obj.playmusic();
        obj.drive();
    }
}
