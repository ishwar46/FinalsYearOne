package operators;

//Simple Interest
public class TaskTwo {
    public static void main(String[] args) {
        int p = 10;
        int t = 22;
        int r = 2;
        int result;
        result = (p*t*r)/100;
        System.out.println(result);
    }
}

//Area of Triangle

class AreaOfTriangle{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 6;
        int s = (a+b+c)/2;
        int area;
        area = (int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}

//Volume of Cube
class VolCube{
    public static void main(String[] args) {
        int a = 2;
        float volume = 2*2*2;
        System.out.println(volume);
    }
}

//Volume of Cuboid
class VolCuboid{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        float volume = a*b*c;
        System.out.println(volume);
    }
}
