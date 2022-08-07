package array;

import java.util.Scanner;

public class InputValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];

        for (int i = 0; i<arr.length;i++){
            System.out.println("Enter a value\n");
            arr[i] = sc.nextInt();
        }
    }
}
