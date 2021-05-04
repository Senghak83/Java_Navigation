
package mspc;


public class ABCPC extends PC {
    private int qty;
    private double price;
    public ABCPC(PC p , int qty,double pr){
        super(p);
        this.qty = qty;
        this.price = pr;    
    }
    public void setQty(int qty){this.qty = qty;}
    public void setPrice(double p){this.price = p;}
    
    @Override
    public int getQty(){return qty;}
    public double getPrice(){return price;}
    
}
