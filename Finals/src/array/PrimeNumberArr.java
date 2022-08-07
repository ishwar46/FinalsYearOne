package array;

import java.util.Scanner;

//Prime Number Using Array
public class PrimeNumberArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number to check if its prime number or not: \n");
        number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < number; i++) {
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    System.out.println(arr[i] + " is not a prime number");
                    break;
                } else {
                    System.out.println(arr[i] + " is a prime number");
                }
            }
        }
    }
}
