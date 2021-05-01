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
public class Person {
    private String id;
    private String name;
    private String sex;
    private String dob;
    public Person(){}
    public Person(String id,String name,String sex,String dob){
        this.id = id ; this.name = name; this.sex = sex; this.dob = dob;
    }
    public Person(Person p){
        id = p.id; name = p.name; sex= p.sex ; dob = p.dob;
    }
    
    
    public String getId(){return id;}
    public String getName(){return name;}
    public String getSex(){return sex;}
    public String getDob(){return dob;}
    
    //  set value
    public void setId(String id){this.id = id;}
    public void setName(String name ){this.name = name;}
    public void setSex(String sex ){this.sex = sex;}
    public void setDob(String dob){this.dob = dob;}
}
