import KfcModel.*;


public class App {
    public static void main(String[] args)  {
        // System.out.println("Hello, World!");
        // Create a new instance of the KFC restaurant model
        KfcModel kfcEgypt = new Kfc("KFC Egypt","Egypt",3325165);
        // =====================  WE CAN CALL EAITHER COCRETE CLASS OR ABSTRACT CLASS  ======================= 
        // Kfc kfcEgypt = new Kfc("KFC Egypt","cairo Egypt",3325165);
        kfcEgypt.getAddress();
        kfcEgypt.getPhoneNumber();
        kfcEgypt.getName();
        kfcEgypt.makeChicken();
        kfcEgypt.makeDrink();
    

    }
}


