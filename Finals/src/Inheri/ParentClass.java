package Inheri;
//Create a class with a method that prints "This is parent class" and its subclass with another method that prints
// "This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

class ParentClass{
    public void Pmethod(){
        System.out.println("Parent Class");
    }
}

class ChildClass extends ParentClass{
    public void Cmethod(){
        System.out.println("This is a child class");
    }
}

class Result{
    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        ChildClass cc = new ChildClass();

        pc.Pmethod();
        cc.Cmethod();
    }
}

