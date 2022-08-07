package array;

import java.util.Scanner;

//Write a Java program to test if an array contains a specific value.
public class SpecificValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1789,2035,1899,1456,2013};
        int value;
        System.out.println("Enter a value: ");
        value = sc.nextInt();
        boolean flag = false;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==value){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("The array contains the value: " + value);
        }
        else{
            System.out.println("The array does not contain the value: " + value);
        }
    }
}
