package controlstatement.loops;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should
//display the count of positive, negative and zeros entered.
public class Count {
    public static void main(String[] args) {
        int num;
        int pos = 0;
        int neg = 0;
        int zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();
        while (num != 0) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zero++;
            }
            System.out.println("Enter any positive number: ");
            num = sc.nextInt();
        }
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Zero numbers: " + zero);
    }
}
