package functions;


import java.util.Scanner;

public class MulNumbers {
    public static void Mul() {
        Scanner sc = new Scanner(System.in);
        int num1, num2,num3, mul;

        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("ENter third number: ");
        num3 = sc.nextInt();

        mul = num1*num2*num3;
        System.out.println("Answer is: " +mul);
    }

    public static void main(String[] args) {
        Mul();
    }
}
