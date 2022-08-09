package OOPSample;

import java.util.Scanner;

//You will be given a string x as input, you must retrieve the second character of the x.
// If x is null or if x has only one character,
// exception will occur, and you must report it. Read input/output to know what to report in case of exceptions.
//The signature of the function is static void checkException( ).
public class Excep {
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


    class Question6 {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the input: ");
            String x = scn.nextLine();
            try {
                if (x.length() < 2) {
                    throw new Exception("Character is Too Short");
                } else {
                    System.out.println(x.substring(1, 2));
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }