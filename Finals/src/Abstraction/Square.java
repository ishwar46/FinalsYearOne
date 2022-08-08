package Abstraction;

public class Square implements Shape {
    @Override
    public void draw() {
        int length = 4;
        System.out.println(length*length);
    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.draw();
        System.out.println(num);    // yo num shape vanne interface class bata aako

    }
}
