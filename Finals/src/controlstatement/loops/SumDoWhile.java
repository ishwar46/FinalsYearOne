package controlstatement.loops;

import java.util.Scanner;

//Write a do-while loop that asks the user to enter two numbers. The numbers
//should be added and the sum displayed. The loop should ask the user whether he
//or she wishes to perform the operation again. If so, the loop should repeat;
//otherwise it should terminate.
public class SumDoWhile {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            num2 = sc.nextInt();
            sum = num1 + num2;
            System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
            System.out.println("Do you want to perform the operation again? (y/n)");
        } while (sc.next().equals("y"));
    }
}
