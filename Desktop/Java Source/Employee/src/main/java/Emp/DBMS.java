/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emp;

import java.util.ArrayList;

/**
 *
 * @author senghak
 */
public class DBMS { 
    ArrayList<Employ> list = new ArrayList();
    public DBMS(){}
    public DBMS(Employ emp){this.list.add(emp);}
    
    //----Insert ---
    public void Insert(Employ emp){list.add(emp);}
    public void Delet(int index ){list.remove(index);}
    public void Udpate(Employ emp,int index){list.set(index, emp);}
    public Employ getEmployee(int index){return list.get(index);}
    
    // Filter 
    public ArrayList<Employ> getEmployF(String name){
        ArrayList<Employ> ls = new ArrayList();
        for(int i =0 ; i<list.size(); i++){
            String n = list.get(i).getName();
            if(name.length()>n.length())continue;
            n = n.substring(0,name.length());
            if(name.equals(n)){
                ls.add(list.get(i));
            }
        }
        
        return ls;
    }
    
    
    
     //-- Sort --

    public ArrayList<Employ> Sort(){
        
        for(int i = 0 ; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i).getName().compareTo(list.get(j).getName())>0){
                    Employ em = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,em);
                }
            }
        }// end loop
        return list;
    }
   //-- getAll Employ
    public ArrayList<Employ> getAllEmploy(){
        return list;
    }
    public int getSize(){return list.size();}
       
}
