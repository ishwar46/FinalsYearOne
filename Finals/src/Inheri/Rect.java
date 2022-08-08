package Inheri;
//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area
// and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to
// initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
// constructor having a parameter for its side (suppose s) calling the constructor of its parent class as
// 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
public class Rect {
    int length;
    int breadth;

    public Rect(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea(){
        System.out.println("Area is : " +length*breadth);
    }

    public void printPerimeter(){
        System.out.println("Perimeter is : " +2*(length+breadth));
    }
}

class Squarenew extends Rect{

    public Squarenew(int length, int breadth) {
        super(length, breadth);
    }
}

class AnsRect {
    public static void main(String[] args) {
        Rect rt = new Rect(10,20);
        rt.printArea();
        rt.printPerimeter();
        Squarenew sqnew = new Squarenew(20,11);
        sqnew.printArea();
        sqnew.printPerimeter();
    }
    }