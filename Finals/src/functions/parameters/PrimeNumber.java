package functions.parameters;

import java.util.Scanner;

//Write a JAVA function to check whether a number is prime or not.
public class PrimeNumber {

    public static void main(String[] args) {
        primeCheck();

    }
    public static void primeCheck(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = sc.nextInt();
        if (num%2==0){
            System.out.println("It is a prime number: ");
        }
        else {
            System.out.println("It is not a prime number");
        }
    }
}
