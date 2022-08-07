package array;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<arr.length;i++){
            System.out.println("Enter a value: ");
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                even +=1;
            }
            else {
                odd+=1;
            }
        }
        System.out.println("No of even numbers are : " + even);
        System.out.println("No of odd numbers are : " + odd);
    }
}
