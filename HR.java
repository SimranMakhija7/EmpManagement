package Employee;
import java.util.*;
import java.util.Random; 

import Employee.Manager;

public class HR extends Manager{
    
    public HR(String name, int age, String gender){
        super(name, age, gender);
        setHike(20);
    }

    Scanner sc = new Scanner(System.in);
    
    public boolean grantLeave(Employee e, int days){

    	if(days >= e.getLeavesLeft()){
    		System.out.println("Your leaves left are " + e.getLeavesLeft() +" ,and you are asking for leave for "+ days+" days.\nY/N");
    		
    		if(sc.next().charAt(0)=='Y'){
    			// System.out.println("Your request is being forwarded.");
    			double dailySalary=e.getSalary()/30;
    			int extra=days-e.getLeavesLeft();
    			// System.out.println(extra);
    			// System.out.println(dailySalary);
    			// System.out.println("BANANA");
    			// System.out.println(e.getSalary());
    			// System.out.println(e.getSalary()-dailySalary*extra);
    			e.setSalary(e.getSalary()-dailySalary*extra);
    			// System.out.println("BANANAAAA");
    			// System.out.println(e.getSalary());
    			return true;
    		}
    	}else{
    	    return true;
    	}
    	return false;
    }
}
