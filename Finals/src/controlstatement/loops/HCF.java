package controlstatement.loops;

import java.util.Scanner;

//Write a program to calculate HCF of Two given number.
public class HCF {
    public static void main(String[] args) {
        int num1, num2, hcf;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        hcf = 1;
        for (int i = 1; i<=num1; i++){
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF of "+num1+" and "+num2+" is "+hcf);
    }
}
