package functions;

public class Hexagon {
    // utility function
    static double areaHexagon(double side)
    {
        return (float)((3 * Math.sqrt(3)) * side * side);
    }

    // driver code
    public static void main(String arg[])
    {
        double side = 4;
        System.out.print("Area of Regular Hexagon = "
                + areaHexagon(side));
    }
}
