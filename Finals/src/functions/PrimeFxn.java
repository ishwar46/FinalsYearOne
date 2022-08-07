package functions;

import java.util.Scanner;

//Check Prime Number Using Function
public class PrimeFxn {
    public static void main(String[] args) {
        CheckPrime();
    }
    public static void CheckPrime(){
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Enter the number to check if its prime number or not: \n");
        number = sc.nextInt();
    }
}
