package com.fastcampus.de.java.clip10;


public class ForEach {
    static String repeat(String str, int n)
    {
        if(str == null || str == "" )
            return str;              // Return the String if it is empty or null.

        String result = "";          // Empty String which will hold The Resultant String Repeated N times
        for ( int i=0;i<n;i++)        // Loop N times
        {
            result = result + str;
        }
        return result;
    }

    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day : days) {
            System.out.println(day);
        }

        String star = "*";
        System.out.println(repeat(star, 5));

        for (int i = 0; i<= days.length-1; i++) {
            System.out.println(days[i]);
        }

    }
}
