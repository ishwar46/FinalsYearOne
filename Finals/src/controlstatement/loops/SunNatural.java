package controlstatement.loops;

import java.util.Scanner;

//Write a program to calculate the sum of first 10 natural number.
public class SunNatural {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<=10; i++){
            sum = sum + i;

        }

        System.out.println("Sum of first 10 natural number: "+sum);
    }
}
