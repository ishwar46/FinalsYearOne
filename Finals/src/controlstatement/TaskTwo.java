package controlstatement;

import java.util.Scanner;

//Write a JAVA program to find maximum between three numbers.
public class TaskTwo {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third numner: ");
        c = sc.nextInt();

        if(a>b||a>c){
            System.out.println("First number is greater");
        }
        else if (b>a||b>c){
            System.out.println("Second number is greater");
        }
        else if (c>a||c>b){
            System.out.println("Third number is greater");
        }
        else {
            System.out.println("Try Again");
        }


    }
}
