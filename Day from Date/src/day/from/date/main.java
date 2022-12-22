package day.from.date;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {
    int sum;//for total
    int mc;//for month code
    int cc=0;//for century code
    int yf,yl;//to find first & last 2 numbers in year
    int leap;//to find leap years
    int rem;//to find day
    void day(int a,int b,int c)
    {
        int y=c;
        //Assigning of month code to respective months
        switch(a)
        {
            case 1 -> mc=1;
            case 2 -> mc=4;
            case 3 -> mc=4;
            case 4 -> mc=0;
            case 5 -> mc=2;
            case 6 -> mc=5;
            case 7 -> mc=0;
            case 8 -> mc=3;
            case 9 -> mc=6;
            case 10 -> mc=1;
            case 11 -> mc=4;
            case 12 -> mc=6;                  
        }
        //for finding last two numbers in year
        yl=c%100;
        System.out.println("Last two numbers in the given Year is : "+yl);
        //for finding first two numbers in year no use in code :)
        while(c!=0)
        {
            yf=Math.abs(c%100);
            c/=100;
        }
        System.out.println("First two numbers in the given Year is : "+yf);
        //Assinging century code to the years
        if(y>=1500 && y<=1599){cc=0;}
        if(y>=1600 && y<=1699){cc=6;}
        if(y>=1700 && y<=1799){cc=4;}
        if(y>=1800 && y<=1899){cc=2;}
        if(y>=1900 && y<=1999){cc=0;}
        if(y>=2000 && y<=2099){cc=6;}
        //finding number of leap years
        leap=yl/4;
        //sum of date, month code, century code, last 2 numbers in year and leap years
        sum=b+mc+cc+yl+leap;
        //get renainder by days in a week
        rem=sum%7;
        switch(rem)
        {
            case 0 -> System.out.println("SATURDAY");
            case 1 -> System.out.println("SUNDAY");
            case 2 -> System.out.println("MONDAY");
            case 3 -> System.out.println("TUESDAY");
            case 4 -> System.out.println("WEDNESDAY");
            case 5 -> System.out.println("THURSDAY");
            case 6 -> System.out.println("FRIDAY");
        }
    }

    public static void main(String[] args) {
        main A;
        int month;
        int day;
        int year;
            Scanner in = new Scanner(System.in);
            A = new main();
            System.out.print("Enter the Month : ");
            month = in.nextInt();
            System.out.print("Enter the Date : ");
            day = in.nextInt();
            System.out.print("Enter the Year : ");
            year = in.nextInt();
        A.day(month,day,year);
    }   
}
