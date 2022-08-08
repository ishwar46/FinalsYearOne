package controlstatement;

import java.util.Scanner;

//A gov wants to provide student loans to std in their country.
//but for a student to be eligible for getting student loan,she/he must
// have minimum of 80% marks in academics. wap to accept the name, age, and marks
// of the student and display if she/he is eligible for the loan or not. - Loop
public class LoanStd {
    public static void main(String[] args) {
        String name;
        int age;
        int marks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of Student: ");
        name = sc.next().toString();

        System.out.println("Enter the age of Student: ");
        age = sc.nextInt();

        System.out.println("Enter the marks obtained by Student: ");
        marks = sc.nextInt();

        System.out.println("Name of the student: " +name);
        System.out.println("Age of the student: " +age);
        System.out.println("Marks obtained by the student: " +marks);
        /*if (marks >= 80) {
            System.out.println("Student is eligible for the loan");
        } else {
            System.out.println("Student is not eligible for the loan");
        }*/

        for (int i = 0; marks>=80; i++) {
            System.out.println("Student is Eligible for loan");
            break;
        }
        for (int j = 0; marks<80; j++){
            System.out.println("Sorry! Student is not Eligible for loan");
            break;
        }
        }
    }