package controlstatement;

import java.util.Scanner;

//Write a JAVA program to check whether a number is even or odd.
public class OddEven {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        num = sc.nextInt();

        if(num%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
