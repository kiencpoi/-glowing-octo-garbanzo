package lab04_2;

import java.util.ArrayList;

public class DateTest {
    public static void main(String[] args) {
        
        MyDate myDate = new MyDate("January 18th 2019");
        MyDate myDate2 = new MyDate("February 18th 2022");
        MyDate myDate3 = new MyDate("February 18th 2023");
        ArrayList<MyDate> myList = new ArrayList<MyDate>(3);
        myList.add(myDate);
        myList.add(myDate2);
        myList.add(myDate3);
        DateUtils.sorttingDate(myList);
        System.out.println(DateUtils.compareDate(myDate, myDate2));
        for (MyDate eDate : myList) {
            eDate.print();
        }
        myDate.setStrYear("One hundred two thousand and thirty four");
        String s = Integer.toString(1253);

        System.out.println(DateUtils.convertStringDateToNumber(myDate));

    }

    
}
