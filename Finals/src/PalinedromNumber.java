//Palindrome Number
public class PalinedromNumber {
    public static void main(String[] args) {
        int number = 123454321;
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        if (number == reverse) {
            System.out.println("Palinedrome");
        } else {
            System.out.println("Not Palinedrome");
        }
    }
}
