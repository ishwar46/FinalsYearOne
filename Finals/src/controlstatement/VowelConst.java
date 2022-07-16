package controlstatement;

import java.util.Scanner;

//Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
public class VowelConst {

    public static void main(String[] args) {
        char character;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character: ");
        character = sc.next().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ){
            System.out.println("It is a vowel letter");
        } else if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' ) {

        }
        else
        {
            System.out.println("It is a consonant");
        }
    }
}
