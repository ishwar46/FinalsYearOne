package controlstatement;

import java.util.Scanner;

//Write a JAVA program to input electricity unit charges and calculate total electricity bill
//according to the given condition:
//For first 50 units Rs. 0.50/unit
//For next 100 units Rs. 0.75/unit
//For next 100 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill.
public class Bill {

    public static void main(String[] args) {
        int units, bill;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of units: ");
        units = sc.nextInt();

        if (units <= 50) {
            bill = units * 50;
        } else if (units <= 150) {
            bill = (50 * 50) + ((units - 50) * 75);
        } else if (units <= 250) {
            bill = (50 * 50) + (100 * 75) + ((units - 150) * 120);
        } else {
            bill = (50 * 50) + (100 * 75) + (100 * 120) + ((units - 250) * 150);
        }

        bill = (int) (bill + (bill * 0.2));
        System.out.println("Total electricity bill: " + bill);
    }
}
