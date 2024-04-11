package KfcModel;


public class Kfc extends KfcModel{

    public Kfc(String name, String address, int phoneNumber) {
        super(name, address, phoneNumber);
    }
    public void makeBurger(){
        System.err.println(this + " is making a burger.");
    
    }
    public void makeChicken(){
        System.err.println(this + " is making a chicken.");
    
    }
    public void makeDrink(){
        System.err.println(this + " is making a Drink.");
    
    }



     
}