package Polymorphism;

public class Calculation extends Arithmetic{
    @Override
    void add(int a, int b) {
        System.out.println(a-b);

    }
    @Override
    void subtract(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    void multiply(int a, int b) {
        System.out.println(a/b);
    }

    @Override
    void divide(int a, int b) {
        System.out.println(a*b);
    }

}
