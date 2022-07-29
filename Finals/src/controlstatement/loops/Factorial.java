package controlstatement.loops;

import java.util.Scanner;

//Write a program to find the factorial value of any number entered through the
//keyboard.
public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
