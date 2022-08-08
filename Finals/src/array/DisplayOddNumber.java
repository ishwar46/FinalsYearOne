package array;

import java.util.Scanner;

//Write a java program to display all the odd numbers from an array.
public class DisplayOddNumber {
    public static void main(String[] args) {
        int []array = new int [5];

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<array.length;i++){
            System.out.println("Enter a value: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Odd numbers are: ");
        for (int i=0; i<array.length;i++){
            if (array[i] %2!=0){
                System.out.println(array[i]);
            }
        }

    }
}
