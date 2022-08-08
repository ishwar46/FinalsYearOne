package Inheri;
//Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes
// named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape"
// and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
// "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
class Shape {

    public void printShape(){
        System.out.println("This is shape");
    }
}
class RectangleSh extends Shape{
    public void printRect(){
        System.out.println("This is Rectangle");
    }
}

class Circle extends Shape{
    public void printShape(){
        System.out.println("This Circular Shape");
    }
}
class SquareTwo extends RectangleSh{
    public void printSquare(){
        System.out.println("Square is a rectangle");
    }
}

class Main{
    public static void main(String[] args) {
        SquareTwo sq2 = new SquareTwo();

        sq2.printRect();
        sq2.printSquare();
    }
}