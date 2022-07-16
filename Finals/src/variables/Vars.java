package variables;

public class Vars {
    //adding two numbers
    public static void main(String args[]) {
        int ishu = 20;
        int ishu2 = 10;
        int result = (ishu+ishu2);
        System.out.println(result);
    }

}

class Wide{
    public static void main(String[] args) {
        int a = 20;
        float f = a;
        System.out.println(a);
        System.out.println(f);
    }
}

class TypeCast{
    public static void main(String[] args) {
        int a = 10;
        float f = (int)a;
        System.out.println(a);
        System.out.println(f);
    }
}

class Type{
    public static void main(String[] args) {
        float f = 10.5f;
        int a = (int)f;
        System.out.println(f);
        System.out.println(a);
    }
}

class Overflow{
    public static void main(String[] args) {
        int a = 130;
        byte b = (byte)a;
        System.out.println(a);
        System.out.println(b);
    }
}
