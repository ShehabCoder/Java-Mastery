import employee.Employee.Employee;

public class App {
    public static void main(String[] args)  {
        Employee emps[]=new Employee[5];
        Employee E1=new Employee("Shehab", "SOfware Engineer");
        Employee E2=new Employee("ali", "financial Analyst",10,6,1533);
        Employee E3=new Employee("Amr", "Data Engineer",10,6,1533);
        Employee E4=new Employee("yasser", "Data archietect",10,6,1533);
        Employee E5=new Employee("noor", "Fo Engineer",10,6,1533);
        emps[0]=E1;
        emps[1]=E2;
        emps[2]=E3;
        emps[3]=E4;
        emps[4]=E5;

        for (Employee e :emps){
            System.out.println(e+"\n");
        }
        }
       
        
      

    }

