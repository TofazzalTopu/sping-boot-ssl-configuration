package com.example.sslserver.utility;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Test {

    String str = "08 05 2015";

    String[] arr = str.split(" ");
//        System.out.println(str.split(" "));
//        System.out.println(dateArray[0]);
//        System.out.println(dateArray[1]);
//        System.out.println(dateArray[2]);

    public static String getDay(int month, int day, int year) {
        return LocalDate.of(
                month, day, year
        ).getDayOfWeek().toString();
    }

    public static String findDay(String day, String month, String year) {
        String[] dates = new String[] { "SUNDAY", "MONDAY", "TUESDAY", //
                "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), //
                Integer.parseInt(month) - 1, // <-- add -1
                Integer.parseInt(day));
        int date_of_week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dates[date_of_week - 1]);
        return dates[date_of_week - 1];
    }

    public static String findDay(int day, int month, int year) {
        String[] dates = new String[] { "SUNDAY", "MONDAY", "TUESDAY", //
                "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        Calendar cal = Calendar.getInstance();
        cal.set(year, //
                month - 1, // <-- add -1
                day);
        int date_of_week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("ll "+ dates[date_of_week - 1]);
        return dates[date_of_week - 1];
    }

    public static void main(String[] args){
        int n = 5;
        Scanner scan = new Scanner(System.in);
        String strDate = scan.nextLine();
        String[] dateArray = strDate.split(" ");

        int month = Integer.parseInt(dateArray[0]);
        int day = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[2]);

//        getDay(month, day, year);
        findDay(month, day, year);

    }
}
