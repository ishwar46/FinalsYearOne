package functions;

import java.util.Scanner;

public class LeapYearFunction {
    public static void main(String[] args) {
        LeapYearFxn();
    }

    public static void LeapYearFxn(){
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.println("Enter the year you want to check :\n ");
        year = sc.nextInt();

        if (year%4==0){
            System.out.println("It is a leap year");
            if (year%100==0){
                System.out.println("Leap Year");
            }
            if (year%400==0){
                System.out.println("It is  a  leap year");
            }
        }
        else {
            System.out.println("It is not a leap year");
        }

    }
}


