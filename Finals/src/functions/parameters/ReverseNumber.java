package functions.parameters;

import java.util.Scanner;

//Write a JAVA function to reverse a number.
public class ReverseNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = sc.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse number: " + reverse);
    }
    public static int reverse(int num){
        int reverse = 0;
        while (num != 0){
            reverse = reverse * 10;
            reverse = reverse + num%10;
            num = num/10;
        }
        return reverse;
    }
}
