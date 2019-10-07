package Employee;
import Employee.Engineer;
import java.util.*;

public class Tester extends Engineer{
	public Tester(String name, int age, String gender){
		super( name,  age,  gender);
		double sal = 600000;
		int h = 10;
		int l = 2;
		
		setSalary(sal);
		setHike(h);
		setLeaves(l);
	}
}
