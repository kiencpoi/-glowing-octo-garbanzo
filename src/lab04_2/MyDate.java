package lab04_2;

import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
    //
    private int day,month,year;
    private String strDay,strMonth,strYear;
    public int toIntMonth(String month)
    {
        //this function convert a String type month to Int type month
        if(month.equals("January")) return 1;
        if(month.equals("February")) return 2;
        if(month.equals("March"))  return 3;
        if(month.equals("April")) return 4;
        if(month.equals("May")) return 5;
        if(month.equals("June")) return 6;
        if(month.equals("July")) return 7;
        if(month.equals("August")) return 8;
        if(month.equals("September")) return 9;
        if(month.equals("October")) return 10;
        if(month.equals("November")) return 11;
        if(month.equals("December")) return 12;
        
        return 0;
        
    }
    
    public int toIntDay(String s)
    {   
        //this function convert a day type like "18th" to 18 (int);
        String t = "";
    
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) <= '9' && s.charAt(i) >= '0')
            {
                t = t.concat(String.valueOf(s.charAt(i)));
                
            }
        }
        return Integer.parseInt(t);
    }
    public int getDay() {
        return this.day;
        
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
       if(this.month >=1 && this.month <=12) return this.month;
       return -1;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStrDay() {
        return this.strDay;
    }

    public void setStrDay(String strDay) {
        this.strDay = strDay;
    }

    public String getStrMonth() {
        return this.strMonth;
    }

    public void setStrMonth(String strMonth) {
        this.strMonth = strMonth;
    }

    public String getStrYear() {
        return this.strYear;
    }

    public void setStrYear(String strYear) {
        this.strYear = strYear;
    }
    
    public MyDate() {
        LocalDate localDate = LocalDate.now();
        year = localDate.getYear();
        month = localDate.getMonthValue();
        day = localDate.getDayOfMonth();
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(String s)
    {
        String[] t = s.split(" ");
        this.month =  toIntMonth(t[0]);
        this.year  =  Integer.parseInt(t[2]);
        this.day =    toIntDay(t[1]);
    }
    public void accept()
    {   
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date: ");
        s =  scanner.nextLine();
        String[] t = s.split(" ");
        this.month =  toIntMonth(t[0]);
        this.year  =  Integer.parseInt(t[2]);
        this.day =    toIntDay(t[1]);
        scanner.close();
    }
    public void print()
    {
        System.out.println("Today is: " + this.getMonth() + "/" + this.getDay() + "/" + this.getYear());
    }
    public void print(String strDay,String strMonth,String strYear )
    {
        System.out.println("Today is: " + strMonth + " " + strDay + " , " + strYear);
    }
}
