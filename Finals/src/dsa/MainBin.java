package dsa;
//Create an interface named sorting which has a single function
//a. void sort(int[] arr,int searchValue)
//and implement the function using a class named BinarySearch.

class BinarySearch {
    public static void sort(int[] arr, int searchValue) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == searchValue) {
                System.out.println("Found at index: " + mid);
                break;
            } else if (arr[mid] < searchValue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
public class MainBin {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        BinarySearch.sort(arr, 5);
    }
}
