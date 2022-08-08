package string;

import java.util.Scanner;

//Find the minimum number of deletions required to convert a string into a palindrome
public class MinimumNumberOfDeletionsPaline {

    // Function to find out     the minimum number of deletions required to
    // convert a given string `X[0…n-1]` into a palindrome
    public static int minDeletions(String X)
    {
        // string 'Y' is a reverse of 'X'
        String Y = new StringBuilder(X).reverse().toString();

        int n = X.length();

        // `lookup[i][j]` stores the length of LCS of substring `X[0…i-1]`, `Y[0…j-1]`
        int[][] lookup = new int[n + 1][n + 1];

        // fill the lookup table in a bottom-up manner
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                // if current character of 'X' and 'Y' matches
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1] + 1;
                }
                // otherwise, if the current character of 'X' and 'Y' don't match
                else {
                    lookup[i][j] = Math.max(lookup[i - 1][j], lookup[i][j - 1]);
                }
            }
        }

        // Now, `lookup[n][n]` contains the size of the longest palindromic subsequence.

        // The minimum number of deletions required will be the difference in the size
        // of the string and the size of the palindromic subsequence

        return n - lookup[n][n];
    }

    public static void main(String[] args)
    {
        String X = "ACBCDBAA";

        System.out.print("The minimum number of deletions required is " +
                minDeletions(X));
    }
}
