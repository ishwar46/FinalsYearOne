package functions;

import java.util.Scanner;

//Write a program for calculating Simple Interest using a function and print
//the result from the function itself.
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
        return P*T*R/100;
    }

}
