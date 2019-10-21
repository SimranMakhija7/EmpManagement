package Employee;

import Employee.Employee;

public class Manager extends Employee{
    public Manager(String name, int age, String gender){
        super(name,age,gender,2);
        setSalary(1200000);
        setLeaves(2);
    }
}
