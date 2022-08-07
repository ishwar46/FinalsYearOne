package Inheri;

public class SingleDog {
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends SingleDog{
    void bark(){
        System.out.println("Barking");
    }
}

class Activities{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}
