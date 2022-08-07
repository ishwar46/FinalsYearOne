package OOPSample;
/*Create a class named Employee where you have to add properties of a employee like
        name, designation, monthly salary and address. You have to access and mutate the values of all these
        properties by creating accessor and mutator methods. After doing this you have to calculate the net
        salary of the employee using a function double calculateNetSalary(double tax)
        where the tax amount varies as
        annual salary is less than 500000 -> 11 %
        annual salary is less than 1000000 -> 18 %
        annual salary is above 1000001 -> 23 %*/
public class Employee {


    String name;
    String designation;
    double monthlysalary;
    String address;

    boolean calculateNetSalary(){
        double AnnualSalary = monthlysalary*12;
        double NetSalary,pf;
        pf=(AnnualSalary % 25);
        NetSalary = AnnualSalary - pf;
//            return NetSalary;
        System.out.println(NetSalary);
        return false;
    }


    public String getName(){
        return name;
    }

    public String getDesignation(){
        return designation;
    }

    public double getMonthlySalary(){
        return monthlysalary;
    }


    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDesignation(String designation){
        this.designation= designation;
    }
    public void setMonthlysalary(double monthlysalary){
        this.monthlysalary= monthlysalary;
    }
    public void setAddress(String address){
        this.address = address;
    }

}
