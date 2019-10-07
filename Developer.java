package Employee;
import Employee.Engineer;
import java.util.*;

public class Developer extends Engineer{
	public Developer(String name, int age, String gender){
		super( name,  age, gender);
		double sal = 1000000;
		int h = 40;
		int l = 3;
		
		setSalary(sal);
		setHike(h);
		setLeaves(l);
	}
}
