package array;

import java.util.Arrays;

public class ArrayReturn {
    public static void main(String[] args) {
        int[] newarr = numbers();
        System.out.println(Arrays.toString(newarr));
    }

    static int[] numbers(){
        int[] Array = {5,6,4,4,9,5,2,4,5,22,12,22};
        return Array;
    }
}
