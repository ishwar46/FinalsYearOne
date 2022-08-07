package controlstatement.switchcase;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number from 1 to 7 only.");
        System.out.println("Enter the number od day you want to display: \n");

        days = sc.nextInt();

        switch (days){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");

            default:
                System.out.println("Invalid Input");
        }


    }
}
