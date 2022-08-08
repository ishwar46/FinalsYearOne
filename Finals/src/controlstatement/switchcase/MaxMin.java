package controlstatement.switchcase;

import java.util.Scanner;

//JAVA Program to find the maximum between two numbers. Using the switch statement.
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;
        int min = 0;
        switch (a) {
            case 1:
                max = a;
                min = b;
                break;
            case 2:
                max = a;
                min = b;
                break;
            case 3:
                max = a;
                min = b;
                break;
            case 4:
                max = a;
                min = b;
                break;
            case 5:
                max = a;
                min = b;
                break;
            case 6:
                max = a;
                min = b;
                break;
            case 7:
                max = a;
                min = b;
                break;
            case 8:
                max = a;
                min = b;
                break;
            case 9:
                max = a;
                min = b;
                break;
            case 10:
                max = a;
                min = b;
                break;
            default:
                max = a;
                min = b;
                break;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
