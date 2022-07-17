package controlstatement.loops;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then
//print the multiplication table of that number.
public class PositiveIntMul {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();

        for (int i = 1; i<=10; i++){

            System.out.println(num+ " x " +i+ " = " +i*num );
        }
    }
}
