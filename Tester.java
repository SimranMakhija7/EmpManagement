package Employee;
import Employee.Engineer;
import java.util.*;

public class Developer extends Enginner{
	public Developer(String name, int age, String gender){
		double sal = 600000;
		int h = 10;
		int l = 2;
		super(String name, int age, String gender);
		setSalary(sal);
		setHike(h);
		setLeaves(l);
	}
}