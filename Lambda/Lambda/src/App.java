import interfaces.lamda_interface;



public class App {

    public  void reverse(String s){

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        App  app=new App(); // or make the Method Static
        lamda_interface myLambda =app::reverse; // we  can use method refernce act  as Lambda expression
        lamda_interface my = (s)-> System.out.println("Hello"+s);        
        
        myLambda.display("Hello ");//creating object of lambda
        my.display("world ");//creating object of lambda

    }
}
