package controlstatement;

import java.util.Scanner;

//Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
public class UpperLower {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character: ");
        ch = sc.next().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("Enter character is lowercase");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("Entered character is uppercase");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
