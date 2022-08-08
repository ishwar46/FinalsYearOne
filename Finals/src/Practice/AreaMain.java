package Practice;
//Write a program to print the area of a rectangle by creating a class
//named ‘Area’ having two methods.
//The first method named ‘setDim’ takes length and breadth of the
//rectangle as parameters and the second method named as getArea
//Returns the area of rectangle. Length and breadth of rectangle are
//entered through keyboard.

import java.util.Scanner;

class Area{
    double length;
    double breadth;
    public void setDim(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea(){
        return length*breadth;
    }


}
public class AreaMain {
    public static void main(String[] args) {

    }
}
