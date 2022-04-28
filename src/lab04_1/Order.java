package lab04_1;
import java.util.Date;
import java.util.ArrayList;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 5;
    private ArrayList<DigitalVideoDiscs> itemsOdered = new ArrayList<DigitalVideoDiscs>(MAX_NUMBERS_ORDERED);
    private int qtyOder;
    private Date dateOrdered;
    public static final int MAX_LIMITTED_ORDERS = 5;
    private static int nbOders =0 ;
    private Order(){
        nbOders++;
        this.dateOrdered = new Date();
        
    }
    // khong su dung ham khoi tao de gioi han so luong order < MAX_NUMBERS_ORDERS
    public static Order getInstance()
    {
        Order obj;
        if(nbOders < 5) {
            obj =  new Order();
            return obj;
        }    
        else{
            System.out.println("Vuot qua ");
            return null;
        }
    }
    public Date getDateOrdered() {
        return this.dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }
    
    
    
    public int getQtyOder() {
        qtyOder = itemsOdered.size();
        return qtyOder;
    }
    public void setQtyOder(int qtyOder) {
        this.qtyOder = qtyOder;
    }
    public void addDigitalVideoDisc(DigitalVideoDiscs discs){
        itemsOdered.add(discs);
    }
    public void addDigitalVideoDisc(DigitalVideoDiscs[] listDisc)
    {
        //add a list of digitalvideodisc
        if(listDisc.length + this.getQtyOder() > MAX_NUMBERS_ORDERED )
        {
            System.out.println("Vuot qua so luong MAX_ORDER");
            for(int i= listDisc.length - (- MAX_NUMBERS_ORDERED  + (listDisc.length + this.getQtyOder())) - 1;i<listDisc.length;i++)
                {
                    System.out.println("Ban da nhap thua " + listDisc[i].getTitle());  
                }
        }

        else for(int i = 0 ; i < listDisc.length;i++ )
        {
            itemsOdered.add(listDisc[i]);
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDiscs disc1,DigitalVideoDiscs disc2)
    {
        if(getQtyOder()  == MAX_NUMBERS_ORDERED) {
            System.out.println("khong du cho trong cho " + disc1.getTitle() + " "+ disc2.getTitle());
        }   
        else {
            itemsOdered.add(disc1);
            if(getQtyOder()  == MAX_NUMBERS_ORDERED) {
                System.out.println("khong du cho trong cho " +  disc2.getTitle());
            }
            else{
                itemsOdered.add(disc2);
            }
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDiscs discs){
        itemsOdered.remove(discs);
    }
    public float totalCost()
    {
        float sum = 0f;
        for(DigitalVideoDiscs x : itemsOdered)
        {
            sum += x.getCost();
        }
        return sum;
    }
    public void Display()
    {
//         ********************Order**************** ******** 
// Date: [date-order] 
// Ordered Items: 
// 1. DVD - [Title] - [category] - [Director] - [Length]: [Price] $ 
// 2. DVD - [Title] - ... 
// Total cost: [total cost] 
// **************************************************
    System.out.println("********************Order**************** ********");
    System.out.println("Date: " + this.dateOrdered);
    System.out.println("Ordered Items:");
    for(int i=0;i<getQtyOder();i++)
    {
        System.out.println((i+1) + ". DVD - "+itemsOdered.get(i).getTitle()
                            +" - " + itemsOdered.get(i).getCategory()
                            +" - " + itemsOdered.get(i).getDirector()
                            +" - " + itemsOdered.get(i).getLength()
                            +": " + itemsOdered.get(i).getCost()+ " $");
    }
    System.out.println("Total cost: "+ this.totalCost() + " $");
    System.out.println("**************************************************");
    }

}
