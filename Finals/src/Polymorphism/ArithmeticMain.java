package Polymorphism;

public class ArithmeticMain {
    public static void main(String[] args) {
        Calculation calculation= new Calculation();
        calculation.add(11, 12);
        calculation.subtract(33,56);
        calculation.divide(22, 55);
        calculation.multiply(69, 42);

        Arithmetic arithmetic= new Arithmetic();
        arithmetic.add(11, 44);
        arithmetic.subtract(44, 77);
        arithmetic.multiply(22, 44);
        arithmetic.divide(66, 77);

    }
}