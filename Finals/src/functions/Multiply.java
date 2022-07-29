package functions;

import java.util.Scanner;

//Write a program for multiplying 3 numbers using a function and return the
//result and print the result from the main function.
public class Multiply {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        num3 = sc.nextInt();
        int result = multiply(num1, num2, num3);
        System.out.println("Result: " + result);
    }
    public static int multiply(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }
}
