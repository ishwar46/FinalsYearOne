package Inheri;

import dsa.Stack;

//Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'EmployeeNew' and 'Manager' inherits the 'Member' class.
// The 'Employee' and 'Manager'
// classes have data members 'specialization' and 'department' respectively.
// Now, assign name, age,
// phone number, address and salary to an employee and a manager by making an object of both of these
// classes and print the same.
 class Member {
    String Name;
    int Age;
    int phoneNumber;
    String Address;
    int Salary;

    public void printSalary(){
        System.out.println(Salary);
    }

}

class EmployeeNew extends Member{
    String Specialization;
}

class Manager extends Member{
    String Department;
}

class Ans{
    public static void main(String[] args) {
        EmployeeNew emp = new EmployeeNew();

        emp.Name = "Ishwar";
        emp.Age = 20;
        emp.phoneNumber = 98000000;
        emp.Address = "Kathmandu";
        emp.Salary = 123334;
        emp.Specialization = "Mobile Development";

        Manager mg = new Manager();
        mg.Name = "Ishwar";
        mg.Age = 20;
        mg.phoneNumber = 98000000;
        mg.Address = "Kathmandu";
        mg.Salary = 123334;
        mg.Department = "Development";

    }
}