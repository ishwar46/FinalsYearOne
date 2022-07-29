package controlstatement.loops;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then
//output a message indicating whether the number is a prime number.
public class PrimeNumber {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();
        int flag = 0;
        for (int i = 2; i<=num/2; i++){
            if (num % i == 0){
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }

    }
}
