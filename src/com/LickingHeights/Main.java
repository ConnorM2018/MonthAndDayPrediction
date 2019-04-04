package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int days;
        int dotw;
        int day;
        int year;
        int numberMonth;

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        
        poem();
        System.out.println("Let's see what day you were born on.");
        System.out.println("What month were you born on? (Enter a number.)");
        numberMonth=keyboard.nextInt();
        switch (numberMonth){
            case 1:
                numberMonth=13;
                break;
            case 2:
                numberMonth=14;
                break;
            default:
                break;
        }
        days=(numberOfDays(numberMonth));
        System.out.println("What day were you born on? (Enter a number)");
        day=keyboard.nextInt();
        System.out.println("What year were you born? (Enter a number)");
        year=keyboard.nextInt();
        dotw=((day+((13* (numberMonth+1))/5)+year+(year/4)-(year/100)+(year/400))%7);
        poemResult(days, numberMonth, dotw);

    }
    public static void poem(){
        System.out.println("There is an old nursery rhyme that goes like this...");
        System.out.println(" ");
        System.out.println("Monday's child is full of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living");
        System.out.println("But the child born on the Sabbath Day.");
        System.out.println("Is fair and wise and good in every way.");
    }
    public static int numberOfDays(int numberMonth) {
        switch (numberMonth) {

            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            case 13:
                return 31;
            case 14:
                return 28;
            default:
                return 31;
        }
    }
    public static void poemResult(int days, int numberMonth,int dotw){
        String month;
        switch (numberMonth){
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="June";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month="December";
                break;
            case 13:
                month="January";
                break;
            case 14:
                month="February";
                break;
            default:
                month="[Error]";
                break;
        }
        System.out.println("There are "+days+" days in "+month+".");
        switch (dotw){
            case 0:
                System.out.println("You were born on a Saturday.");
                System.out.println("According to the poem, you work hard for a living.");
                break;
            case 1:
                System.out.println("You were born on a Sunday.");
                System.out.println("According to the poem, you are fair and wise and good in every way.");
                break;
            case 2:
                System.out.println("You were born on a Monday.");
                System.out.println("According to the poem, you are fair of face.");
                break;
            case 3:
                System.out.println("You were born on a Tuesday.");
                System.out.println("According to the poem, you are full of grace.");
                break;
            case 4:
                System.out.println("You were born on a Wednesday.");
                System.out.println("According to the poem, you are full of woe.");
                break;
            case 5:
                System.out.println("You were born on a Thursday.");
                System.out.println("According to the poem, you have far to go.");
                break;
            case 6:
                System.out.println("You were born on a Friday.");
                System.out.println("According to the poem, you are loving and giving.");
                break;
            default:
                System.out.println("Something has gone wrong, please try again.");
                break;

        }
    }

}
