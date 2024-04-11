package Customer;
import interfaces.Member;

public class Customer implements Member {

    public  String name;

    public Customer(String  name){
        this.name = name;
    }

    public void callBack(){
        System.out.println("Call back to the customer"+this.name);
    }


}
