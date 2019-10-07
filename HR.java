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
    
    public boolean grantLeave(Employee e, int day){

    	if(days > e.leavesLeft){
    		System.out.println("Your leaves left are " + e.leavesLeft +" ,and you are asking for leave for "+ days+" days.\nY/N");
    		String ans = sc.nextLine();
    		if(ans == "N"){
    			return FALSE;
    		}else if(ans=="Y"){
    			System.out.println("Your request is being forwarded.");
    		}
    	}
    	Random rand = new Random(); 
    	int status = rand.nextInt(2); 
    	if (status == 1){
    		return TRUE;
    	}else{
    		return FALSE;
    	}
    }
}
