package Employee;

import Employee.Researcher;

public class Cloud extends Researcher{
    public Cloud(String name, int age, String gender){
        super(name,age,gender);
        setLeaves(3);
        setHike(40);
    }
}
