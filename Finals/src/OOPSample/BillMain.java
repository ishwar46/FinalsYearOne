package OOPSample;

import java.util.Scanner;

public class BillMain {
    public static void main(String[] args) {
        int units;
        double totalBill = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        units = sc.nextInt();
        if (units <= 50) {
            totalBill = units * 0.50;
        } else if (units > 50 && units <= 150) {
            totalBill = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units > 150 && units <= 250) {
            totalBill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            totalBill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }
        totalBill = totalBill + totalBill * 0.20;
        System.out.println("Total bill amount: " + totalBill);
    }
}
