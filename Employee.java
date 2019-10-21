package Employee;
//util.Date needs to be used to initiaise date and then sent into Date.Date constructor using formatter
import java.util.*;
import java.text.*;
import myDate.myDate; 
import Employee.HR;
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
    private myDate doj;
    private int leavesTaken;
    
    public Employee(String name, int age, String gender){
        DOJ = new Date(); 
        this.name = name;
        this.gender = gender;
        this.age = age;
        empId = baseId;
        baseId = baseId + 1;
        leavesLeft = leavesAllowed;
        leavesTaken=0;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(DOJ);
        doj=new myDate(strDate);
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
    public void setHike(int h){
        hike = h;
    }
    public int getEmpId(){
        return empId;
    }
    private String getDOJ(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String strDate= formatter.format(DOJ);    
        return strDate;
    }
    
    public void requestLeave(HR boss, int days){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String strDate= formatter.format(new Date());
        myDate today=new myDate(strDate);
        if(today.getMonth()==1) leavesTaken=0;
        int m=1;
        if(today.getYear()-doj.getYear()!=0){
             m=today.getMonth()-1;
        }else{
             m=today.getMonth()-doj.getMonth();
        }
        leavesLeft=m*leavesAllowed-leavesTaken;
        boolean granted=boss.grantLeave(this,days);
        if(granted){
            leavesTaken+=days;
            System.out.println("Leave granted");
        }else{
            System.out.println("Leave denied");
        }
    }
    
}
