package controlstatement.loops;

import java.util.Scanner;

public class CheckPrimeWhileLoop {
    public static void main(String[] args) {
        int num;
        boolean isPrime = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        int i = 2;
        while (i<=num/2){
            if (num%i==0){
                isPrime=true;
                break;
            }
            i++;
        }
        if (!isPrime){
            System.out.println(num+ "is a prime number");
        }
        else {
            System.out.println(num+ "is not a prime number");
        }
    }
}
