package functions;
//Area of Rhombus
public class Rhombus {
    public static void main(String[] args) {
        double side = 4;
        System.out.print("Area of Rhombus = "
                + areaRhombus(side));
    }
    public static double areaRhombus(double side){
        return (float)((5 * Math.sqrt(5)) / 2 * side * side);
    }
}

//Perimeter of Rhombus
class RhombusTwo {
    public static void main(String[] args) {
        double side = 4;
        System.out.print("Perimeter of Rhombus = "
                + perimeterRhombus(side));
    }
    public static double perimeterRhombus(double side){
        return (float)(5 * side);
    }
}