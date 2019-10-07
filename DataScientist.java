package Employee;

import Employee.Researcher;

public class DataScientist extends Researcher{
    public DataScientist(String name, int age, String gender){
        super(name,age,gender);
        setLeaves(3);
        setHike(40);
    }
}
