package controlstatement.loops;

import java.util.Scanner;

//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 .....
public class Fib {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i<num-2; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
