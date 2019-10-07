package Employee;

public class Employee
{
    private int leavesAllowed;
    private String name;
    private String gender;
    private int age;
    private static int baseId = 18001;
    private int empId;
    private double salary;
    private int hike;
    private int leavesLeft;
    
    public Employee(String name, int age, String gender){
        this.name = name;
        this.gender = gender;
        this.age = age;
        empId = baseId;
        baseId = baseId + 1;
    }
    
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setGender(String g){
        gender = g;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double s){
        salary = s;
    }
    public int getLeaves(){
        return leavesAllowed;
    }
    public void setLeaves(int l){
        leavesAllowed = l;
    }
    public int getLeavesLeft(){
        return leavesLeft;
    }
    public void setLeavesLeft(int left){
        leavesLeft=left;
    }
    public int getHike(){
        return hike;
    }
    public void setHIke(int h){
        hike = h;
    }
    public int getEmpId(){
        return empId;
    }
    
}
