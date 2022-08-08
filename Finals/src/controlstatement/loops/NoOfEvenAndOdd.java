package controlstatement.loops;
//WAP to display no. of even and no. of odd number between 10 and 30.
public class NoOfEvenAndOdd {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        for(int i = 10; i<=30; i++){
            if (i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even number: "+even);
        System.out.println("Odd number: "+odd);
    }
}
