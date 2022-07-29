package controlstatement.loops;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even
//and odd integers.
public class OddEven {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("Enter the integer: ");
            int num = sc.nextInt();
            if (num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even number: "+even);
        System.out.println("Odd number: "+odd);
    }
}
