package controlstatement.loops;
//Write a program to print out all Armstrong numbers between 1 and 500. If sum of
//cubes of each digit of the number is equal to the number itself, then the number is
//called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
public class Armstrong {
    public static void main(String[] args) {
        int num;
        for (int i = 1; i<=500; i++){
            int sum = 0;
            int temp = i;
            while (temp != 0){
                int digit = temp % 10;
                sum = sum + digit * digit * digit;
                temp = temp / 10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
