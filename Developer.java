package Employee;
import Employee.Engineer;
import java.util.*;

public class Developer extends Enginner{
	public Developer(String name, int age, String gender){
		double sal = 1000000;
		int h = 40;
		int l = 3;
		super(String name, int age, String gender);
		setSalary(sal);
		setHike(h);
		setLeaves(l);
	}
}