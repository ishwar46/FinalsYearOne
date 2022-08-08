package controlstatement.switchcase;

import java.util.Scanner;

public class MarksNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0;
        int percentage = 0;
        char grade = ' ';
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        percentage = sum / 5;
        switch (percentage) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 70:
                grade = 'C';
                break;
            case 60:
                grade = 'D';
                break;
            case 40:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println(percentage);
        System.out.println(grade);
    }
}
