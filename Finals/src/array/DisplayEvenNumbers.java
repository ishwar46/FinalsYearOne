package array;

import java.util.Scanner;

//Write a java program to display all the even numbers from an array.
public class DisplayEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<arr.length;i++){
            System.out.println("Enter a value: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers are: ");
        for (int i=0; i<arr.length;i++){
            if (arr[i] %2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
