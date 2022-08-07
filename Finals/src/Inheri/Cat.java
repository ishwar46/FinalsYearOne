package Inheri;
/*Create a class named Cat where you have to add properties like type, age, color and origin. You have to
        add all possible types of constructors that can be created in this class and utilize them in another class
while create unique objects.*/
public class Cat {
    String type;
    String age;
    String color;
    String origin;
    public Cat() {
    }
    public Cat(String type, int age, String color, String origin) {
        this.type = type;
        this.age = String.valueOf(age);
        this.color = color;
        this.origin = origin;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
