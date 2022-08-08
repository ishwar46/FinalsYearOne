package Encap;
///*WAP to create a class named Employee where
//you have to add data members like name, designation,
//monthly salary, address.
//Here,you have to perform encapsulation with data hiding
//and calculate the net salary of the employee with respect
// to tax amount as
//if annual salary is less than 200000 --> 15%
//if annual salary is less than 400000 --> 20%
//if annual salary is greater than 400001 -->30%
// */
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ishwar");
        emp.setDesignation("CEO");
        emp.setMonthlySalary(10000);
        emp.setAddress("Kathmandu");
        emp.setAnnualSalary(emp.getMonthlySalary() * 12);
        emp.setNetSalary((int) (emp.getAnnualSalary() - emp.getAnnualSalary() * 0.15));
        System.out.println("Name: " + emp.getName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Monthly Salary: " + emp.getMonthlySalary());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Net Salary: " + emp.getNetSalary());
    }
}
class Employee{
    private String name;
    private String designation;
    private int monthlySalary;
    private String address;
    private int annualSalary;
    private int netSalary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
    public int getNetSalary() {
        return netSalary;
    }
    public void setNetSalary(int netSalary) {
        this.netSalary = netSalary;
    }
}
