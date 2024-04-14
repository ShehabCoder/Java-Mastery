public class App {

     static void GenericMethod(Data obj) {

        obj.display();
    }
    public static void main(String[] args) {
        // Create an instance of Data class
        Data<Integer> dataContainer = new Data<>();
        // Data dataContainer = new Data<>();// values will be add as a generic withOUT type save
        dataContainer.addData(1);
        dataContainer.addData(2);
        dataContainer.addData(3);
        GenericMethod(dataContainer);

        // DataString MyData = new DataString();
        // MyData.addData(1);
        // MyData.addData(1);
        // MyData.addData(1);
        // // MyData.addData("Hello Sheab") ;
        // MyData.display();

    }
}
