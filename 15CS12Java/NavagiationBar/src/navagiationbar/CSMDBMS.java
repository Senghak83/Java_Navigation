/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navagiationbar;


import java.util.ArrayList;

/**
 *
 * @author senghak
 */
public class CSMDBMS {
    private ArrayList<Customer> db = new ArrayList();
    
    public void AddCust(Customer c){db.add(c);}
    public void UpdatCus(Customer c ,int index){db.set(index, c);}
    public void RemovCus(int index){db.remove(index);}
    public Customer getCustomer(int index){return db.get(index);}
    public ArrayList<Customer> getAllCustomer(){return db;}
    public int size(){return db.size();}
    //---- Filter
    public ArrayList<Customer> FilterNameCust(String name){
        ArrayList<Customer> ls = new ArrayList();
        for(int i = 0 ; i<db.size(); i++){
            String n = db.get(i).getName();
            if(name.length()> n.length())continue;
            n = n.substring(0, name.length());
            if(n.equals(name))
                ls.add(db.get(i)); 
        }
        return ls;
    }
    //---------
    
}
