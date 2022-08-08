package Practice;
//Create a class named ‘Student’ with string variable ‘name’ and integer
//variable ‘roll no’. Assign the value of roll no as ‘2’ and that of name as
//“John” by creating an object of the class student.
//Assign and print the roll number phone number and address of two
//students names “Sam” and “John” Respectively by creating two objects
//of class ‘Student
public class StdMain {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("John");
        std.setRollNo(2);
        System.out.println(std.getName());
        System.out.println(std.getRollNo());
        Student std2 = new Student();
        std2.setName("Sam");
        std2.setRollNo(3);
        System.out.println(std2.getName());
        System.out.println(std2.getRollNo());
    }
}

class Student {
    String name;
    int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
