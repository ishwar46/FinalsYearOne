package controlstatement;

import java.util.Scanner;

//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
public class TaskFour {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        num = sc.nextInt();

        if (num%5==0 && num%11==0){
            System.out.println("Number is divisible by 5 and 11");
        }
        else
            System.out.println("It is not divisible by 5 and 11");
    }
}
