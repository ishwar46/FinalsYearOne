package controlstatement.loops;

import java.util.Scanner;

//Write a program that generates a random number and asks the user to guess what
//the number is. If the user's guess is higher than the random number, the program
//should display "Too high, try again." If the user's guess is lower than the random
//number, the program should display "Too low, try again." The program should use
//a loop that repeats until the user correctly guesses the random number.
public class NumberGuess {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100: ");
        guess = sc.nextInt();
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
            System.out.println("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
        }
        System.out.println("Congratulations! You guessed the number correctly.");

    }
}
