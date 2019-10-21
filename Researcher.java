package Employee;

import Employee.Employee;

public class Researcher extends Employee{
    public Researcher(String name, int age, String gender){
        super(name,age,gender,4);
        setSalary(1500000);
    }
}
