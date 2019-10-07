package Employee;

import Employee.Employee;

public class Researcher extends Employee{
    public Researcher(String name, int age, String gender){
        super(name,age,gender);
        setSalary(1500000);
    }
}
