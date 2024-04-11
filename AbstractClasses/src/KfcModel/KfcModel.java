package KfcModel;

public abstract class KfcModel {
    private String name, address;
    private int phoneNumber;
    public KfcModel(String name, String address,int phoneNumber){
        setAddress(address);
        setName(name);
        setPhoneNumber(phoneNumber);
    }
    //getters and setters for the variables in the model
    public String getName(){return name;}
    public void setName(String name) {this.name = name;}
    
    public String getAddress() { return address ;} 
    public void setAddress(String address) { this.address = address; }

    public int getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber;}

    public abstract void  makeBurger();
    public abstract void makeChicken();
    public  abstract void makeDrink();

    
}
