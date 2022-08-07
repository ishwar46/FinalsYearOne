package OOPSample;

import java.util.Scanner;

//Consider and take a number as input and count all the numbers that are the factors of 3 which is less than that of
// the number considered. If there are no factors or the number is less than 0 then the output must be 0.
public class QuestionTwo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        num = sc.nextInt();
        int count = 0;
        for (int i = 1; i<=num; i++){
            if (num % i == 0){
                if (i % 3 == 0){
                    count++;
                }
            }
        }
        System.out.println("Number of factors of 3: "+count);
    }
}
