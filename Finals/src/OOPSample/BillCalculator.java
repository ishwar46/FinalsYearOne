package OOPSample;

import java.util.Scanner;

//Write a JAVA program to input electricity unit charges and calculate total electricity bill according to the given
// condition:
//For first 50 units Rs. 0.50/unit
//For next 100 units Rs. 0.75/unit
//For next 100 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill.
//Here, all the logic to calculate and display the total electricity bill must be done separately in the
// BillCalculator class based on the OOP concepts, Encapsulation and Data Hiding.
// The signature of the method to display the total bill amount is as.
//void calculateTotalBill( )
//And the overall phenomena of taking the user input must be done in the separate
// Driver class where the object of the former class has to be called for displaying the total bill amount.
public class BillCalculator {
    public static void main(String[] args) {
        BillCalculator bc = new BillCalculator();
        bc.calculateTotalBill();
    }
    public void calculateTotalBill() {
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
