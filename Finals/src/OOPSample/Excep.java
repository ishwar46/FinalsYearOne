package OOPSample;
//You will be given a string x as input, you must retrieve the second character of the x. If x is null or if x has only one character,
// exception will occur, and you must report it. Read input/output to know what to report in case of exceptions.
//The signature of the function is static void checkException( ).
public class Excep {
    public static void main(String[] args) {
        String x = "";
        try {
            x = checkException(x);
            System.out.println("Second character: "+x);
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
    public static String checkException(String x) throws Exception {
        if (x == null || x.length() == 1) {
            throw new Exception("Exception");
        }
        return x.substring(1, 2);
    }
}
