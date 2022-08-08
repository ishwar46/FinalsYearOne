package PrimeNumber;

import java.util.Scanner;

//
public class OneToHundred {
    public static void main (String[] args)
    {
        int i =0;
        int num =0;
        String primeNumbers = ""; //Empty String

        for (i = 1; i <= 100; i++)
        { int counter=0; for(num =i; num>=1; num--)
        {
            if(i%num==0)
            {
                counter = counter + 1;
            }
        }
            if (counter ==2)
            {
            //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}

//user input
class PrimeNumbers2
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        String primeNumbers = "";
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers between 1 and n are: ");
        System.out.println(primeNumbers);
    }
}