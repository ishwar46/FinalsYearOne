package Practice;
//Write a program to print the area and perimeter of a triangle having
//sides of 3,4, and 5 units by creating a class named ‘Triangle’ without
//any parameter in its constructor.
public class Triangle {
    public static void main(String[] args) {
        double area = (3 * 4 * 5) / 2;
        double perimeter = 3 + 4 + 5;
        System.out.println("Area of triangle is: "+area);
        System.out.println("Perimeter of triangle is: "+perimeter);
    }
}
//Write a program to print the area and perimeter of a triangle having
//sides of 3,4, and 5 units by creating a class named ‘Triangle’ with
//constructor having the three sides as its parameters
 class TriangleTwo {
    double side1;
    double side2;
    double side3;
    public TriangleTwo(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public static void main(String[] args) {
        TriangleTwo tri = new TriangleTwo(3, 4, 5);
        double area = (tri.side1 * tri.side2 * tri.side3) / 2;
        double perimeter = tri.side1 + tri.side2 + tri.side3;
        System.out.println("Area of triangle is: "+area);
        System.out.println("Perimeter of triangle is: "+perimeter);
    }
}