package controlstatement.switchcase;

import java.util.Scanner;

//Using switch statement Write a JAVA program to input marks of five subjects Physics,
//Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
//following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
public class Marks {
    public static void main(String[] args) {
        int Chem;
        int Bio;
        int Maths;
        int CS;
        int marks;
        int percentage;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for Chemistry: ");
        Chem = sc.nextInt();
        System.out.println("Enter the marks for Biology: ");
        Bio = sc.nextInt();
        System.out.println("Enter the marks for Mathematics");
        Maths = sc.nextInt();
        System.out.println("Enter the marks for Co");
        CS = sc.nextInt();

        marks = (Chem+Bio+Maths+CS);
        System.out.println("Marks Obtained is " +marks);

        percentage = (marks)/4;
        System.out.println("Total Percentage " +percentage);

        switch(percentage) {
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
                System.out.println("Grade A");
                break;
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                System.out.println("Grade B");
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                System.out.println("Grade C");
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                System.out.println("Grade D");
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                System.out.println("Grade E");
                break;
            default:
                System.out.println("Grade F");
                break;
        }
    }
}
