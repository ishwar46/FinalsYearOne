package operators;

public class Ope {
//Unary Operator
public static void main(String[] args) {
    int a = 10;
    int b = 22;
    System.out.println(a++);
    System.out.println(++a);
    System.out.println(a--);
    System.out.println(--a);
    System.out.println(b++);
}
}

//++ and --
class Unary{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a++ + a++);
        System.out.println(b++ + ++b);
    }
}

class Una{
    public static void main(String[] args) {
        int a = 10;
        int b  = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);
    }
}

//Arithmetic Operators

class Arth{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a%b);
    }
}

//Left shift
class ArthLeft{
    public static void main(String[] args) {
        System.out.println(10<<2);
        System.out.println(10<<3);
        System.out.println(20<<4);
    }
}

//Right shift
class ArthRigt{
    public static void main(String[] args) {
        System.out.println(10>>2);
    }
}

class OperatorExample{
    public static void main(String args[]){
        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);
    }}

//AND Operator
class And{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a>b&b<a);
        System.out.println(a<b&b>a);
    }
}

//OR Operator
class OR{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a<b||b>c);
        System.out.println(a>b||b<c);
    }
}

//Ternary Operator

class Ter{
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int min=(a<b)?a:b;
        System.out.println(min);
    }
}

class TerNew{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int min = (a<b)?a:b;
        System.out.println(min);
    }
}

class TerTask{
    public static void main(String[] args) {
        int febDays = 29;
        String result;

        result = (febDays==28)? "Not a leap year" : "Leap Year";
        System.out.println(result);

    }
}

//Assignment Operator
class Assig{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int result;
        result = a+b;
        System.out.println(result);
    }
}


