package Abstraction;

public class Cow implements Mammal,Animal{
    @Override
    public void printStatus() {
        System.out.println("Cow mammal ni ho");
    }

    @Override
    public void print() {
        System.out.println("Cow Animal ni ho");

    }

    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.print();
        cow.printStatus();
    }
}
