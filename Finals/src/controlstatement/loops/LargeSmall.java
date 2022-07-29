package controlstatement.loops;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end the
//program should display the largest and smallest numbers entered.
public class LargeSmall {
    public static void main(String[] args) {
        int num;
        int largest = 0;
        int smallest = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();
        while (num != 0) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            System.out.println("Enter any positive number: ");
            num = sc.nextInt();
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
