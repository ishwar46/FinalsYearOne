package Inheri;

import java.sql.Time;

//Super Class
public class TimeEmployee {
    public String fname;
    public String lname;
    public String dob;

    public String displayName(){
        return fname + " " + lname;
    }
}

class PartTimeEmp extends TimeEmployee{
    public float hourlySalary;
    public int noOfDays = 26;
    public float calculateAnnualSalary(){
        return hourlySalary * noOfDays *12;
    }
}
class FulTimeEmp extends TimeEmployee {
    float monthlySalary;

    public float calculateAnnualSalary(){
        return monthlySalary * 12;
    }
}

