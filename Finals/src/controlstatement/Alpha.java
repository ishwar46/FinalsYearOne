package controlstatement;

import java.util.Scanner;

//Write a JAVA program to check whether a character is alphabet or not.
public class Alpha {
    public static void main(String[] args) {
       char alphabet;
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character: ");
        alphabet = sc.next().charAt(0);

        if (alphabet>='a' && alphabet <='z'){
            System.out.println("It is an alphabet");
        } else if (alphabet>='A' && alphabet <='Z') {
            System.out.println("It is an alphabet");
        }
        else {
            System.out.println("invalid input");
        }
    }
}
