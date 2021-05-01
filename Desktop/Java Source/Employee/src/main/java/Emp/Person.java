
package Emp;

public class Person {
   private String id;
   private String name;
   private String sex;
   private String dob;
   
   public Person(){ }
   
   public Person(String id,String n, String s,String dob){
       this.id = id; this.name = n; sex = s; this.dob = dob;
   }
   public void setID(String id){this.id = id;}
   public void setName(String name){this.name = name;}
   public void setSex(String s){this.sex = s;}
   public void setDob(String d){this.dob = d;}
        
   public String getID(){return id;}
   public String getName(){return name;}
   public String getSex(){return sex;}
   public String getDob(){return dob;}
   
   
   
}
