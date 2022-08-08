package array;

import java.util.Arrays;

//Find all elements in an array that are greater than all elements to their right
//Given an unsorted integer array, print all greater elements than all elements present to their right.
public class GreaterRightElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = findGreaterRightElements(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findGreaterRightElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}

//Find all elements in an array that are greater than all elements to their left
//Given an unsorted integer array, print all greater elements than all elements present to their left.
 class GreaterLeftElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = findGreaterLeftElements(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findGreaterLeftElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
