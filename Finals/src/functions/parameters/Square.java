package functions.parameters;
//Area of Square
public class Square {
    public static void main(String[] args) {
        double side = 4;
        System.out.print("Area of Square = "
                + areaSquare(side));
    }
    public static double areaSquare(double side){
        return side * side;
    }
}

//Perimeter of Square

class SquareTwo {
    public static void main(String[] args) {
        double side = 4;
        System.out.print("Perimeter of Square = "
                + perimeterSquare(side));
    }
    public static double perimeterSquare(double side){
        return side * 4;
    }
}