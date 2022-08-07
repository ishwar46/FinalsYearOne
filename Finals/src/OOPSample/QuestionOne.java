package OOPSample;
//Write a function that accepts an array of non-negative integers and returns the second largest integer in the array.
// Return -1 if there is no second-largest integer.
//The signature of the function is int findSecondLargest(int[ ] a)
public class QuestionOne {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int secondLargest = findSecondLargest(a);
        System.out.println("Second largest number: "+secondLargest);
    }
    public static int findSecondLargest(int[] a){
        int largest = a[0];
        int secondLargest = a[0];
        for (int i = 1; i<a.length; i++){
            if (a[i]>largest){
                secondLargest = largest;
                largest = a[i];
            }
            else if (a[i]>secondLargest){
                secondLargest = a[i];
            }
        }
        if (secondLargest == largest){
            return -1;
        }
        else{
            return secondLargest;
        }
    }
}
