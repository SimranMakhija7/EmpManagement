package Employee;
import Employee.Engineer;
import java.util.*;

public class Developer extends Enginner{
	public Developer(String name, int age, String gender){
		double sal = 1200000;
		int h = 50;
		int l = 4;
		super(String name, int age, String gender);
		setSalary(sal);
		setHike(h);
		setLeaves(l);
	}
}