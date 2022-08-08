package OOPSample;
//Find the highest, second highest, and lowest of three random generated numbers without using conditional statements
public class HighLowNums {
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        int highest = a[0];
        int secondHighest = a[0];
        int lowest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > highest) {
                secondHighest = highest;
                highest = a[i];
            } else if (a[i] > secondHighest) {
                secondHighest = a[i];
            }
            if (a[i] < lowest) {
                lowest = a[i];
            }
        }
        System.out.println("Highest number is: " + highest);
        System.out.println("Second highest number is: " + secondHighest);
        System.out.println("Lowest number is: " + lowest);
    }
}
