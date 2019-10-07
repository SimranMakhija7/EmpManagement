package Employee;
import Employee.Engineer;
import java.util.*;

public class Architect extends Engineer{
	public Architect(String name, int age, String gender){
		super( name,  age,  gender);
		double sal = 1200000;
		int h = 50;
		int l = 4;
		
		setSalary(sal);
		setHike(h);
		setLeaves(l);
	}
}
