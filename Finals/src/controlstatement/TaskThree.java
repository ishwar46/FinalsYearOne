package controlstatement;

import java.util.Scanner;

//Write a JAVA program to check whether a number is negative, positive or zero
public class TaskThree {
    public static void main(String[] args) {
        float num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        num = sc.nextFloat();

        if (num>=0){
            System.out.println("It is a positive number");
        } else if (num<=0) {
            System.out.println("It is a negative number");
        }
        else if (num==0){
            System.out.println("It is zero");
        }
    }
}
