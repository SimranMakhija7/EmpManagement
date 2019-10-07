package Employee;
<<<<<<< HEAD
=======
import java.util.*;
>>>>>>> b445fb078f1a15d27329c9c78c1e90a6a29efebd

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
    private Date DOJ;
    
    public Employee(String name, int age, String gender){
        DOJ = new Date(); 
        this.name = name;
        this.gender = gender;
        this.age = age;
        empId = baseId;
        baseId = baseId + 1;
        leavesLeft = leavesAllowed;
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
    private String getDOJ(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(DOJ);    
        return strDate;
    }
    
}
