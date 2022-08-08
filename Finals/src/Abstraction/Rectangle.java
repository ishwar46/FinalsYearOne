package Abstraction;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        int length = 4;
        int breadth = 2;
        System.out.println(length*breadth);

    }
}
