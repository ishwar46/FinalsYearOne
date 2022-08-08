package controlstatement.loops;
//// Java program to find the sum of positive numb
import java.util.Scanner;

public class SumPositiveNum {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();
        while (sum>=0){
            sum += number;

            System.out.println("Enter a number: ");
            number = sc.nextInt();
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
