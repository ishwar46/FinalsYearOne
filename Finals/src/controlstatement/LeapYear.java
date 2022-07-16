package controlstatement;

import java.util.Scanner;

//Write a JAVA program to check whether a year is leap year or not.
public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year you want to check: \n");
        year = sc.nextInt();

        if (year%400 == 0){
            System.out.println("It is a leap year");
        } else if (year%100==0) {
            System.out.println("It is not a leap year");

        }
        else if(year%4 == 0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
