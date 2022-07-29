package functions;

import java.util.Scanner;

//
public class CircleArea {
    public static void Area(){
        double radius, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = sc.nextDouble();
        area = 3.14 * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
    public static void main(String[] args) {
        Area();
    }

}
