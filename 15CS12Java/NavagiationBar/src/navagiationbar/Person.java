
package navagiationbar;

public class Person {
   private String id;
   private String name;
   private String sex;
   private String dob;
   private String add;
   
   //-- Construct
   public Person(Person p ){
       id = p.id;
       name = p.name;
       sex = p.sex;
       dob = p.dob;
       add = p.add;
   }
   public Person(String i,String n,String s,String d,String a){
       id = i; name =n ; sex = s; dob = d; add = a;
   }
   
   public void setId(String id){this.id = id;}
   public void setName(String name){this.name = name;}
   public void setSex(String sex ){this.sex = sex;}
   public void setDob(String dob){this.dob = dob;}
   public void setAddr(String add){this.add = add;}
   
   public String getID(){return id;}
   public String getName(){return name;}
   public String getSex(){return sex;}
   public String getDob(){return dob;}
   public String getAddr(){return add;}
   
   public Person getPersion(){return this;}
   
}
