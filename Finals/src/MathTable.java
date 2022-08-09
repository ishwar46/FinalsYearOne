import java.util.Scanner;

public class MathTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i=1; i<=10; i++){
            int res = N*i;
            System.out.println(N+" x "+i+" = "+res);

        }
        in.close();
    }
}

//MathTable Reverse
class RevMath{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=10; i>=1; i--){
            int res = N*i;
            System.out.println(N+" x "+i+" = "+res);
        }
        in.close();
    }
}

//Print the multiplication table of 15 using recursion.
class Recursion{
    public static void main(String[] args) {
        int N = 15;
        for(int i=1; i<=10; i++){
            int res = N*i;
            System.out.println(N+" x "+i+" = "+res);
        }
    }
}