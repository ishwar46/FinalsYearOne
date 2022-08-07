package Inheri;

public class EmpMain {
    public static void main(String[] args) {
        PartTimeEmp emp = new PartTimeEmp();

        emp.fname = "Ishwar";
        emp.lname = "Chaudhary";
        emp.hourlySalary = 1200;
        System.out.println("Full name is : " +emp.displayName());
        System.out.println("Salary is : " +emp.calculateAnnualSalary());


        FulTimeEmp fullemp = new FulTimeEmp();
        fullemp.fname = "Sam";
        fullemp.lname = "Adhikari";
        fullemp.monthlySalary = 15000;
        System.out.println("Full name is : " +fullemp.displayName());
        System.out.println("Annual Salary is : " +fullemp.calculateAnnualSalary());

    }
}
