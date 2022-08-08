package controlstatement.loops;

import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        int n, even = 0, odd = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                even = even + a[i];
            }
            else
            {
                odd = odd + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+even);
        System.out.println("Sum of Odd Numbers:"+odd);
    }
}
