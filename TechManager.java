package Employee;

import Employee.Manager;

public class TechManager extends Manager{
    public TechManager(String name, int age, String gender){
        super(name, age, gender);
        setHike(30);
    }
}
