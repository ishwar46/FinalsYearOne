package OOPSample;

import java.util.Scanner;

//Consider and take a number as input and sum all the numbers that are not the factors of 3 which is less than
//// that of the number considered.
//// If all the numbers are the factors or the considered number is less than 0 then the output must be 0.
// You must use break and continue statements.
public class QuestionThree {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=num; i++){
            if (num % i == 0 && num > 0){
                if (i % 3 != 0){
                    sum = sum + i;
                }
            }
        }
        System.out.println("Sum of all the numbers that are not factors of 3: "+sum);
    }
}
