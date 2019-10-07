package Employee;

import Employee.Manager;

public class HR extends Manager{
    public HR(String name, int age, String gender){
        super(name, age, gender);
        setHike(20);
    }
}
