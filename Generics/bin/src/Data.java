/**
 * InnerApp
 */
@SuppressWarnings("unchecked")
class Data<T> {

    private  T data[] =(T[]) new Object[3];
    private int counter=0;

    public void addData(T d) {

        data[counter]=d;
        counter++;
    }
    public void display(){
        for(int i=0;i<data.length;i++) {
            System.out.println(data[i]);
    }   
    }
}





