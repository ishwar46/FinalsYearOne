package functions.parameters;
//Area of Rectangle
public class Rectangle {
    public static void main(String[] args) {
        double length = 4;
        double width = 3;
        System.out.print("Area of Rectangle = "
                + areaRectangle(length, width));
    }
    public static double areaRectangle(double length, double width){
        return length * width;
    }
}

//Perimeter of Rectangle
class RectangleTwo {
    public static void main(String[] args) {
        double length = 4;
        double width = 3;
        System.out.print("Perimeter of Rectangle = "
                + perimeterRectangle(length, width));
    }
    public static double perimeterRectangle(double length, double width){
        return (length + width) * 2;
    }
}