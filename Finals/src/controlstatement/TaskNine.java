package controlstatement;

import java.util.Scanner;

//Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
public class TaskNine {
    public static void main(String[] args) {
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <='z'){
            System.out.println("It is an alphabet");
        } else if (ch >='A' && ch<='Z') {
            System.out.println("It is an alphabet");
        } else if (ch >='0' && ch<='9') {
            System.out.println("It is a digit");
        }
        else {
            System.out.println("It is a special character");
        }

    }
}
