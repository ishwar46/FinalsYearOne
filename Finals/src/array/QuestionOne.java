package array;

import java.util.Arrays;

public class QuestionOne {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        for (int i = 0; i<arr.length;i++){
            arr[i]=i;
            System.out.println(i);
        }
    }
}

class ArrayNew{
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;


        System.out.println(Arrays.toString(numbers));
    }
}

class NewArray{
    public static void main(String[] args) {
        int[] numbers = {2,3,10,5,4,7,8};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

class MultiDemArr{
    public static void main(String[] args) {
        int[][][] numbers = new int[2][3][4];
        numbers[0][0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }

}