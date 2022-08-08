package controlstatement.loops;

import java.util.Scanner;

public class EndLoopWithNegNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(;;){
            int n = sc.nextInt();
            if(n<1){
                break;
            }
        }
    }
}
