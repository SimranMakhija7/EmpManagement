package Employee;

import Employee.Researcher;

public class Analyst extends Researcher{
    public Analyst(String name, int age, String gender){
        super(name,age,gender);
        setLeaves(3);
        setHike(40);
    }
}
