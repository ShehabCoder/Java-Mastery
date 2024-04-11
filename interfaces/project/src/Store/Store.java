package Store;

// import Customer.Customer;
import interfaces.Member;

public class Store {

    Member  members[] = new Member[4];
    int counter=0;
    public void Register(Member m){
        members[counter]=m;
            counter++;
    }

    public void inviteSale(){
        int i=0;
        while (i<members.length) {
            members[i].callBack();
            i++ ;
            
        }

    }

    

}