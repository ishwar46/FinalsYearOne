package PrimeNumber;

import java.util.Scanner;

public class greatestPrimeCheck {
    public static int greatestPrime(int num) {
        int calculatedPrimeNo = 0;
        if (num == 0 || num == 1) {
            return 2;
        }
        do {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                calculatedPrimeNo = num;
            } else {
                num++;
            }
        } while (calculatedPrimeNo != num);
        return calculatedPrimeNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(greatestPrime(num) - num);
    }
}
