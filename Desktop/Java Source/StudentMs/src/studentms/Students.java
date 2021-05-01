/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentms;

/**
 *
 * @author senghak
 */
public class Students extends Person{
    private String depart;
    private String major;
    private int year;

    public Students(Person p , String depart,String major,int year)
    {
        super(p);
        this.depart = depart; this.major = major; this.year = year;
    }    
    //--
    public String getDepart(){return depart;}
    public String getMajor(){return major;}
    public int getYear(){return year;}
    
    
    
}
