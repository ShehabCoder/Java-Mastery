package   employee.Employee;

public class Employee {

    public String name;
    private double salary ;
    public String role;
    public double deposit;
    public double roll;

    // Default constructor

    public Employee(String name ,String role,double deposit,double roll,double salary) {

        this.name=name;
        this.role=role;
        this.deposit=deposit;
        this.roll=roll;
        setSalary(salary);
    }
    // Construcor Overloading 
    public Employee(String name,String role ) {
        this.name=name;
        this.role=role;
        this.roll= 0;
        this.deposit=10000.0;
        setSalary(250000);
    }
    // Getter and Setter Methods
    public void setSalary(double salary){this.salary=salary;}
    public double getSalary(){return salary ;}

    public String toString(){
        return "\n name:"+name +"\n Role :"+role +"\n Salary: "+salary +"\n Roll No:"+roll +"\n Deposited Amount: "+deposit ;
    }





    
}
