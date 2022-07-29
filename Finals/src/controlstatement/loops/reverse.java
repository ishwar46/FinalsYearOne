package controlstatement.loops;

import java.util.Scanner;

//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the output
//should be 54321.
public class reverse {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();
        int rev = 0;
        while (num != 0){
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse is "+rev);
    }
}
