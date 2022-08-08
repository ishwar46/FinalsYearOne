package Inheri;
//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and
// perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to
// nitialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
// constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
// Print the area and perimeter of a rectangle and a square.
public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea(){
        System.out.println(length*breadth);
    }

    public void printPerimeter(){
        System.out.println(2*(length+breadth));
    }
}

class Square extends Rectangle{

    public Square(int length, int breadth) {
        super(length, breadth);
    }
}

class ResultRect{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10,20);
        rect.printArea();
        rect.printPerimeter();

        Square sq = new Square(2,3);
        sq.printArea();
        sq.printPerimeter();

    }
}
