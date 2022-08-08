package controlstatement.loops;
//even odd count 18
public class OddEvenCount {
    public static void main(String[] args) {
        int i = 1;
        int evencount = 0;
        int oddcount=0;
        do {
            if (i % 2 == 0) {
                evencount++;
                oddcount++;
            } else {
                oddcount++;
            }
            i++;
        }
        while (i <= 18);
        if (evencount>oddcount){
            System.out.println("even is more");
        }else{
            System.out.println("odd is more");
        }
    }
}
