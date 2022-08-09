package functions;

import java.util.Scanner;

//Product of Two numbers using method prodNum()
public class ProductOfTwoNums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Product of "+num1+" and "+num2+" is: "+prodNum(num1, num2));
        sc.close();
    }

    public static int prodNum(int num1, int num2) {
        return num1*num2;
    }


}
