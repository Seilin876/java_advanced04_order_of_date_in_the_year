package com.example.advancedhw04;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int day=0;
        boolean leapyear=false;
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入欲轉換的西元年 月 日");
        int yearsca = scanner.nextInt();
        int monthsca = scanner.nextInt();
        int daysca = scanner.nextInt();
         while(monthsca>12){System.out.println("請重新輸入正確的月份喔");
            monthsca = scanner.nextInt();}
        while(daysca>month[monthsca]){System.out.println("當月似乎沒有這個日期,請重新輸入日期");
            daysca = scanner.nextInt();}

        int mon=monthsca;
        if(yearsca%4!=0)leapyear = false;
        else if(yearsca%100!=0)leapyear = true;
            else if (yearsca%400!=0)leapyear = false;
            if(leapyear==true)month[2]=29;
               for(int i=0;i<mon;i++){
                   day = month[monthsca-1]+day;
                   monthsca = monthsca-1;}
               day=day+daysca;
        System.out.println(day);
}
}