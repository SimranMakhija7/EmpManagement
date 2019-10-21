import Employee.Employee;
import Employee.Developer;
import Employee.Cloud;
import Employee.HR;
import java.util.*;
import myDate.*;
import java.text.*;

public class test{
    public static void main(String dgs[]){
        Developer Abby= new Developer("Abby",24,"Female");
        Cloud Dan=new Cloud("Dan",25,"Male");
        HR Stella=new HR("Stella",25,"Female");
        ArrayList<Employee> employees=new ArrayList<Employee>();
        employees.add(Abby);
        employees.add(Dan);
        employees.add(Stella);
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Employee Management system");
        System.out.println("Please enter your name.");
        String username=sc.nextLine();
        Employee currentUser=null;
        boolean exit=false;
        for(Employee employee: employees){
            if(username.equals(employee.getName())){
                currentUser=employee;
            }
        }
        if(currentUser==null){
            System.out.println("USER NOT FOUND");
            exit=true;
        }
        
        while(exit==false){
            System.out.println("What do you want to do?");
            System.out.println("1.Display salary\n2.Display leaves left for the month.\n3.Request leave");
            switch(sc.nextInt()){
                case 1: System.out.println(currentUser.getSalary()); break;
                case 2: System.out.println(currentUser.getLeavesLeft()); break;
                case 3:{
                    System.out.println("For how many days?");
                    int days=sc.nextInt();
                    currentUser.requestLeave(Stella,days);
                    break;
                }
            }
            System.out.println("Do you wish to exit the program?(Y/N)");
            if(sc.next()=="Y"){ exit=true;}
        }
    }
}
