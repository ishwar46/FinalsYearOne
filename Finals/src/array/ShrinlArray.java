package array;
//Given an integer array, shrink it by removing adjacent triplets that satisfy the given constraints and
// return the total number of elements in the resultant array.
public class ShrinlArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                i += 3;
            } else {
                i++;
            }
            count++;
        }
        System.out.println(count);
    }
}

class Main
{
    // Recursive function to shrink a given array by removing adjacent triplets from it
    public static int shrink(int[] arr, int start, int end, int k)
    {
        // Base case
        if (start > end) {
            return 0;
        }

        // Keep track of the total number of elements in the resultant array
        int result = 0;

        /* Case 1: The first element, arr[start], does not form a triplet */

        // Skip the first element, and recur for the next element
        result = 1 + shrink(arr, start + 1, end, k);    // +1 since `start` is included


        /* Case 2: The first element, arr[start], forms a triplet with some
                `arr[i]` and `arr[j]` */

        // Consider all triplets, and check if they can be removed from the array
        for (int i = start + 1; i < end; i++)
        {
            for (int j = i + 1; j <= end; j++)
            {
                /* Process current triplet: (arr[start], arr[i], arr[j]) */

                // If the difference between elements of the current triplet is `k`
                if (arr[i] == arr[start] + k && arr[j] == arr[i] + k)
                {
                    // Recursively check if all elements between `start` & `i` and
                    // between `i` & `j` can be removed
                    if (shrink(arr, start + 1, i - 1, k) == 0 &&
                            shrink(arr, i + 1, j - 1, k) == 0)
                    {
                        // Recur for the next element, and update the result
                        int n = shrink(arr, j + 1, end, k);
                        if (result > n) {
                            result = n;
                        }
                    }
                }
            }
        }

        // Return number of elements in the resultant array
        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = { -1, 2, 5, 8, 2, 5 };
        int k = 3;

        System.out.println("The total number of elements in the resultant array is "
                + shrink(arr, 0, arr.length - 1, k));
    }
}