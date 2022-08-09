package ExcepHandling;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x = sc.nextLine();
        try {
            x = checkException(x);
            System.out.println("Second character: "+x);
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
    public static String checkException(String x) throws Exception {
        if (x == null || x.length() == 1) {
            throw new Exception("Character is null or has only one character");
        }
        return x.substring(1, 2);
    }
}
