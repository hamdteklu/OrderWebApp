import javax.faces.bean.ManagedBean;

@ManagedBean(name="bookBean")
 
public class BookBean{
    private double quantityOrder;
    private double price = 12.99;
    private double totalCharge;
    
    public BookBean(){
        
    }
    
    public void setQuantityOrder(double
            qo){
        quantityOrder = qo;
    }
    
    public double getQuantityOrder(){
        return quantityOrder;
                
    }
    
    public void setTotalCharge(double tc){
        
        totalCharge = tc;
        
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public double getPrice()
    {
        return price;
    }
    
    public double getTotalCharge(){
        
        totalCharge = quantityOrder * price;
        return totalCharge;
    }
    
}