package functions.parameters;

import java.util.Scanner;

//using function with parameters Write a JAVA function to calculate Simple Interest.
public class SI {
    public static void main(String[] args) {
        int P;
        int T;
        int R;
        int SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle: ");
        P = sc.nextInt();
        System.out.println("Enter the Time: ");
        T = sc.nextInt();
        System.out.println("Enter the Rate: ");
        R = sc.nextInt();
        SI = simple(P,T,R);
        System.out.println("Simple Intrest of the following is: " +SI);
    }
    public static int simple(int P, int T, int R){
        int SI;
        SI = P * T * R / 100;
        return SI;
    }

}

