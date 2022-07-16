package controlstatement;

import java.util.Scanner;

//Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
public class Triangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angles of a triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a+b+c == 180) {
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is not a valid triangle");
        }
    }
}

//. Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.

class CheckTriangle{
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of a triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is not a valid triangle");
        }
    }
}

//Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
class CheckTriangle2{
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of a triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a==b && b==c) {
            System.out.println("It is an equilateral triangle");
        } else if (a==b || b==c || a==c) {
            System.out.println("It is an isosceles triangle");
        } else {
            System.out.println("It is a scalene triangle");
        }
    }
}