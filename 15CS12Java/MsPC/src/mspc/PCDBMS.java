/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mspc;

import java.util.ArrayList;

/**
 *
 * @author senghak
 */
public class PCDBMS  {
    private ArrayList<ABCPC> db = new ArrayList(); // has -
    
    public void InsertPC(ABCPC pc){db.add(pc);}
    public void DeletePC(int index){db.remove(index);}
    public void UpdatePC(ABCPC pc,int index){db.set(index, pc);}
    public ABCPC getPC(int index){return db.get(index);}
    public ArrayList<ABCPC> getAllPc(){return db;}
 
    public ArrayList<ABCPC> getFilterID(String id){
        ArrayList<ABCPC> ls = new ArrayList();
        for(ABCPC p : db){
            String n = p.getID(); 
            if(id.length()>n.length())continue;
            n = n.substring(0, id.length());
            if(n.equals(id)){
                ls.add(p);
            }
            
        }// end loop
        return ls;
    }// funciton
}
