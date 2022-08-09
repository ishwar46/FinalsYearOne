package functions;
//Area of pentagon
public class Pentagon {
    public static void main(String[] args) {
        double side = 4;
        System.out.print("Area of Pentagon = "
                + areaPentagon(side));
    }
    public static double areaPentagon(double side){
        return (float)((5 * Math.sqrt(5)) / 2 * side * side);
    }
}

//Perimeter of pentagon
class PentagonTwo {
    public static void main(String[] args) {
        double side = 4;
        System.out.print("Perimeter of Pentagon = "
                + perimeterPentagon(side));
    }
    public static double perimeterPentagon(double side){
        return (float)(5 * side);
    }
}