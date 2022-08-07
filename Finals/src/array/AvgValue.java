package array;
//Write a Java program to calculate the average value of array element.
import java.util.Scanner;

public class AvgValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<arr.length;i++){
            System.out.println("Enter a value: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];

        }
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average value of the array: " + sum/5);
    }
}
