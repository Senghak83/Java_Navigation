/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentms;

import java.util.ArrayList;

/**
 *
 * @author senghak
 */
public class DBMS extends ArrayList<Students>{
    
    public void Insert(Students stu){super.add(stu);}
    public void Delete(int index){this.remove(index);}
    public void Update(Students stu,int index){this.set(index, stu);}
    public Students getStudent(int index){return this.get(index);}

    
    public ArrayList<Students> getAllStudents(){return this;}
    
//--- Filter
    public ArrayList<Students> getFilterName(String name){
        ArrayList<Students> st = new ArrayList();
        for(Students s : this){
            String n = s.getName();
            if(name.length()>n.length())continue;
            n = n.substring(0,name.length());
            if(n.equals(name))
                st.add(s);
        }// end loop
        
        return st;
    }
    
    //---- sort by name
    
    public void sortByName(){
        for(int i = 0 ; i<this.size(); i++){
            for(int j = i +1 ; j<this.size(); j++){
                if(this.get(i).getName().compareTo(this.get(j).getName())>0){
                    
                  Students stu = this.get(i);
                  this.set(i, this.get(j));
                  this.set(j, stu);

                }
            }// inner loop
        }// outer loop        

    } 
    //------------
    
    
}
