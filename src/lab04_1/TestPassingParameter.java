package lab04_1;

public class TestPassingParameter {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    DigitalVideoDiscs jungleDVD = new DigitalVideoDiscs("Jungle");
    DigitalVideoDiscs cinderellaDVD = new DigitalVideoDiscs("Cinderella");
    
    swap(jungleDVD, cinderellaDVD);
    
    System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());    
    System.out.println("jungle dvd title:"+ jungleDVD.getTitle());

    changeTitle(jungleDVD, cinderellaDVD.getTitle());
    System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    

    }
    
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle(DigitalVideoDiscs dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDiscs(oldTitle);
    }
}
    
