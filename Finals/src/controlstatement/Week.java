package controlstatement;

import java.util.Scanner;

//Write a JAVA program to input week number and print weekday.
public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekNo;

        System.out.println("Enter the week number you want to display" +
                        "Please select from 1 to 7");
        weekNo = sc.nextInt();

        if (weekNo == 1){
            System.out.println("Sunday");
        } else if (weekNo == 2) {
            System.out.println("Monday");
        }
        else if (weekNo == 3){
            System.out.println("Tuesday");
        }
        else if(weekNo == 4){
            System.out.println("Wednesday");
        } else if (weekNo == 5) {
            System.out.println("Thursday");
        } else if (weekNo == 6) {
            System.out.println("Friday");
        } else if (weekNo == 7) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
