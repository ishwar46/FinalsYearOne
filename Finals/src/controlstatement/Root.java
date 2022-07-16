package controlstatement;

import java.util.Scanner;

//Write a JAVA program to find all roots of a quadratic equation.
public class Root {

    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        a = sc.nextDouble();
        System.out.println("Enter the value of b: ");
        b = sc.nextDouble();
        System.out.println("Enter the value of c: ");
        c = sc.nextDouble();

        d = (b*b) - (4*a*c);
        if (d<0){
            System.out.println("The equation has no real roots");
        } else if (d==0){
            x1 = -b/(2*a);
            System.out.println("The equation has one real root: " + x1);
        } else {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("The equation has two real roots: " + x1 + " and " + x2);
        }
    }
}
