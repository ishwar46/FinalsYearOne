package controlstatement.loops;

import java.util.Scanner;

//Two numbers are entered through the keyboard. Write a program to find the value
//of one number raised to the power of another. (Do not use Java built-in method)
public class RaisePower {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num1 = sc.nextInt();
        System.out.println("Enter any positive number: ");
        num2 = sc.nextInt();
        int result = 1;
        for (int i = 1; i<=num2; i++){
            result = result * num1;
        }
        System.out.println(num1+" raised to the power of "+num2+" is "+result);
    }

}
