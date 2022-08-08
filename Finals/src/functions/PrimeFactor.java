package functions;

import java.util.Scanner;

//Define a method to print the prime factors of a number.
public class PrimeFactor {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        printPrimeFactors(number);
    }
    public static void printPrimeFactors(int number){
        for(int i=2; i<=number; i++){
            if(number%i==0){
                System.out.print(i+" ");
                number = number/i;
                i--;
            }
        }
    }
}
