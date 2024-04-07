package car;
import Vehicle.Vehicle;


public class Car extends Vehicle {
    private int numberOfDoors;
    private String Color;
    public String Model;
    public int Price;

    // Constructors
    public Car(){
        super();
        this.numberOfDoors = 4;
        this.Model="Default";
        this.Color ="Default";
        this.Price =11000;
    }
    public Car(String type,int limit,int numberOfDoors,String color,String model,int price){
        super(type,limit);
        this.numberOfDoors = numberOfDoors;
        this.Model=model;
        this.Color =color;
        this.Price =price;
    }



    
    public int GetNumberOfDoors(){
        return   numberOfDoors;
    }
    public void SetNumberOfDoors(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }
    public String GetColor() { return Color;}
    public void SetColor(String Color) { this.Color= Color;}
    
    // here i applied Overriding
    public String showDetails() {
        // System.out.println("The speed limit for this vehicle is: " + SpeedLimit);
        return "This is a " + VehicleType +"Speed Limit :"+ SpeedLimit+"\nNo Of Doors:"+numberOfDoors+"\nModel:"+Model ;    
    }
    public  boolean isAvailableCar(){
       if (super.IsAvailable(Model))
           return true;
       else{
           System.out.println("The car is not available");
           return false;
       }
    }

    public String  toString(){
        
        return "Vehicle Object:"+Vehicle.class+"\nType: "+super.VehicleType+"\nLimit: "+super.SpeedLimit+ "\nNumber of Doors:" +numberOfDoors+
               "\nColor :"+Color +"\nModel :" + Model +"\nPrice :$"+ Price+"\n Made in :"+ super.Getmanufature()  ;

            }
}
