package Abstraction;

public class Calculation extends Arithmetic{
    @Override
    protected void arithmetic() {
        int a =4;
        int b =5;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.arithmetic();
        calc.showDetails();
    }
}
