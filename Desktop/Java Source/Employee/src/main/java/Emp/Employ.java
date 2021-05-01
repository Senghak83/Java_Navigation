
package Emp;

public class Employ extends Person{
    private String start;
    private String pos;
    private double slary;
    
    public Employ(String id,String name,String sex,String dob,String start,
            String position,double salary)
    {
        super(id,name,sex,dob);
        this.start = start; pos = position; this.slary = salary;
    }
    public void setStart(String start){this.start = start;}
    public void setPosition(String p){this.pos = p;}
    public void setSalary(double s){this.slary = s;}
    
    public String getStart(){return start;}
    public String getPosition(){return pos;}
    public double getSalary(){return slary;}
    
    
}
