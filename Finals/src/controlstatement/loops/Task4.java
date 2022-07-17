package controlstatement.loops;

import java.util.Scanner;

//WAP to display multiplication table of a given no.
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter number for table: ");
        number = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(number+ "x" +i+ " = " +i*number);
        }
    }
}
