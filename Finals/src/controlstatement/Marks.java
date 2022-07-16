package controlstatement;

import java.util.Scanner;

//Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
//Mathematics and Computer. Calculate percentage and grade according to following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
public class Marks {
    public static void main(String[] args) {
        int physics, chemistry, biology, mathematics, computer;
        double percentage;
        char grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Physics: ");
        physics = sc.nextInt();
        System.out.println("Enter marks of Chemistry: ");
        chemistry = sc.nextInt();
        System.out.println("Enter marks of Biology: ");
        biology = sc.nextInt();
        System.out.println("Enter marks of Mathematics: ");
        mathematics = sc.nextInt();
        System.out.println("Enter marks of Computer: ");
        computer = sc.nextInt();

        percentage = (physics + chemistry + biology + mathematics + computer) / 5.0;
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }
}
