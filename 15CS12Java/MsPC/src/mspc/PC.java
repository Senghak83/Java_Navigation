
package mspc;


public class PC {
   private String id;
   private String speach;
   private String country;
   
   public PC(String id,String speach,String count){
       this.id = id; this.speach = speach; country= count;
   }
   public PC(PC p){
       id = p.id; speach = p.speach; country = p.country;
   }
   public PC(){}
   public void setID(String id){this.id = id;}
   public void setSpeach(String sp){this.speach = sp;}
   public void setCountry(String cou){this.country = cou;}
   
   public String getID(){return id;}
   public String getSpeach(){return speach;}
   public String getCountry(){return country;}
  
   public int getQty(){return 10;}
   
}
