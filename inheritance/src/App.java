import Vehicle.Vehicle;
import car.*;
public class App {
    public static void main(String[] args)  {
        
        Car c= new Car("Car", 250,5, "Red","BMW",750000);

        // THis is a Dynamic Dispatch;
        Vehicle v= new Car("Car", 250,5, "Red","BMW",750000);
        System.out.println(c);
        System.out.println("-----------------===============THis is a Dynamic Dispatch-----------------------------------------------------");
        System.out.println(v.Getmanufature());
        // System.out.println(v);
    
    }
}
