import interfaces.*;
import Store.Store;
import Customer.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        Test.Show();
        Member c=new Customer("shehab");
        Member c1=new Customer("shahd");
        Member c2=new Customer("ali");
        Member c3=new Customer("saher");
        Store s = new Store();
        s.Register(c);
        s.Register(c1);
        s.Register(c2);
        s.Register(c3);
        s.inviteSale();
        System.out.println("Welcome to our store! Please log in or register if you are a customer.");
    
    }
}
