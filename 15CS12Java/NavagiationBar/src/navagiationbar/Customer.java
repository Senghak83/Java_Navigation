
package navagiationbar;

public class Customer extends Person{
    private String phone;
    private String other;
    public Customer(Person p, String phone,String other){
        super(p);
        this.phone = phone;
        this.other = other;
    }
    public void setPhone(String ph){phone = ph;}
    public void setOther(String oth){this.other = oth;}
    
    public String getPhone(){return phone;}
    public String getOther(){return other;}
    
    public Customer getCustormer(){return this;}
}
