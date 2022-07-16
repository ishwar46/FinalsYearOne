package controlstatement;

import java.util.Scanner;

//Write a JAVA program to count total number of notes in given amount.
public class NoteCount {
    public static void main(String[] args) {

        int amount, notes, count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        amount = sc.nextInt();

        notes = amount/100;
        count = count + notes;
        amount = amount%100;

        notes = amount/50;
        count = count + notes;
        amount = amount%50;

        notes = amount/20;
        count = count + notes;
        amount = amount%20;

        notes = amount/10;
        count = count + notes;
        amount = amount%10;

        notes = amount/5;
        count = count + notes;
        amount = amount%5;

        notes = amount/2;
        count = count + notes;
        amount = amount%2;

        notes = amount/1;
        count = count + notes;
        amount = amount%1;

        System.out.println("Total number of notes: " + count);

    }
}
