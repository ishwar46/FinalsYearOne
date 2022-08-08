package array;
//Given an integer array nums, find the maximum value of j-i such that nums[j] > nums[i].
public class MaxValueInArray {
    //Function to find the maximum value of `j-i` such that nums[j] > nums[i]
    public static int findMaxDiff(int[] nums)
    {
        // `diff` stores the maximum value of `j-i` such that nums[j] > nums[i]
        int diff = Integer.MIN_VALUE;

        // base case
        if (nums == null || nums.length == 0) {
            return diff;
        }

        int n = nums.length;

        // create an auxiliary array of size `n`
        int[] aux = new int[n];

        // aux[j] stores the maximum element in subarray nums[j, n-1]
        aux[n - 1] = nums[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            aux[j] = Integer.max(nums[j], aux[j + 1]);
        }

        // Find maximum `j-i` using the auxiliary array
        for (int i = 0, j = 0; i < n && j < n; )
        {
            if (nums[i] < aux[j])
            {
                diff = Integer.max(diff, j - i);
                j++;
            }
            else {
                i++;
            }
        }

        return diff;
    }

    public static void main(String[] args)
    {
        int[] nums = { 9, 10, 2, 6, 7, 12, 8, 1 };
        System.out.println("The maximum value is " + findMaxDiff(nums));
    }
}
