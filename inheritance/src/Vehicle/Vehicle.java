package Vehicle;

public class Vehicle {
    public String VehicleType;
    public int SpeedLimit;
    private String manufature="Egypt";
    
    //Default constructor 
    public Vehicle(){
        this.VehicleType = "Default";
        this.SpeedLimit=0;
        }
        // Constructor for the vehicle object
        public Vehicle(String type, int limit) {
            this.VehicleType = type;
            this.SpeedLimit=limit; 
        }
        
    // Getter Method
    public String Getmanufature(){
        return this.manufature;
    }
    
    
    public String  start() {
        return "Starting the vehicle";
    }
    public String stop(){
        // System.out.println("Stopping the vehicle");
        return "Stoping the vehicle";
    }
    public boolean IsAvailable(String model){
      if (model == "BMW")
          return true;
      else
           return false;    
    

    }
    
    // Method to display details of a vehicle
    public String showDetails() {
        // System.out.println("The speed limit for this vehicle is: " + SpeedLimit);
        return "This is a " + VehicleType +"Speed Limit :"+ SpeedLimit ;    
    }
    public String toString(){
        return "--- >"+ start()+ "\n---->"+stop()+ "\n"  +showDetails();
    }
}
