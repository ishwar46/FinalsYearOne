package array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//Find the smallest missing positive number from an unsorted array
public class SmallestMissingNum {
    // Function to find the smallest missing positive number from an unsorted array
    public static int findSmallestMissing(int[] nums)
    {
        // use a range constructor to initialize the set from array elements
        Set<Integer> distinct = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        // return first smallest missing positive number from the set
        int index = 1;
        while (true)
        {
            if (!distinct.contains(index)) {
                return index;
            }
            index++;
        }
    }

    public static void main(String[] args)
    {
        int[] nums = { 1, 4, 2, -1, 6, 5 };

        System.out.println("The smallest missing positive number from the array is "
                + findSmallestMissing(nums));
    }
}
