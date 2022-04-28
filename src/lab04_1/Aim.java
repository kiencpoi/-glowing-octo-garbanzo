package lab04_1;


public class Aim {
    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
        Order anorder = Order.getInstance();
        // Create a new dvd object and set the fields
        DigitalVideoDiscs dvd1 = new DigitalVideoDiscs("The Lion King");
        dvd1.setCategory ("Animation");
        dvd1.setCost (19.95f);
        dvd1.setDirector ("Roger Allers");
        dvd1.setLength (87);
         // add the dyd to the order
        anorder.addDigitalVideoDisc(dvd1);
        DigitalVideoDiscs dvd2 = new DigitalVideoDiscs("Star wars");
        dvd2.setCategory ("Science Fiction");
        dvd2.setDirector ("George Lucas");
        dvd2.setLength (124);
        dvd2.setCost(24.95f);
        anorder.addDigitalVideoDisc(dvd2);
        DigitalVideoDiscs dvd3 = new DigitalVideoDiscs("Aladdin");
        dvd3. setCategory ("Animation");
        dvd3.setCost (18.99f);
        dvd3.setDirector ("John Musker");
        dvd3. setLength (90);
         // add the dyd to the order
        anorder.addDigitalVideoDisc(dvd3);
        anorder.removeDigitalVideoDisc(dvd2); // test remove function
        System.out.print ("Total Cost is: ");
        System.out.println(anorder.totalCost());
        System.out.println(anorder.getQtyOder());
        DigitalVideoDiscs[] list = new DigitalVideoDiscs[2];
        list[0] = (new DigitalVideoDiscs("Kien"));
        list[1] = (new DigitalVideoDiscs("tuan"));
        anorder.addDigitalVideoDisc(list);
        anorder.Display();
        Order kien = Order.getInstance();
        Order tuan = Order.getInstance();
        Order dat = Order.getInstance();
        Order khanh= Order.getInstance();
        tuan.Display();;
        kien.Display();;
        dat.Display();;
        khanh.Display();;

    }
    
}
