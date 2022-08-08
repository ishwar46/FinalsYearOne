package controlstatement;

import java.util.Scanner;

//Write a JAVA program to find maximum between two numbers.
public class MaxBtnTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the number a");
        a = sc.nextInt();

        System.out.println("Enter the number b");
        b = sc.nextInt();

        if(a>b){
            System.out.println(a+ " Is the maximum number");
        }
        else {
            System.out.println("b is greater");
        }
    }
}
