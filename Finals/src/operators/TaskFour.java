package operators;
//Write a program to calculate the total marks of four subjects of a student and the total
//percentage secured. And use following conditions to generate the final result;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail
public class TaskFour {
    public static void main(String[] args) {
        int sub1 = 40;
        int sub2 = 44;
        int sub3 = 44;
        int sub4 = 45;
        int total;
        int per;
        int grade;
        total = (sub1 + sub2 + sub3 + sub4);
        per = total / 4;
        System.out.println("Total Marks is " +total);
        System.out.println("Total Percentage is " +per);
        if(per>=70){
            System.out.println("First Class");
        } else if (per>=59) {
            System.out.println("Upper Second Class");

        } else if (per>=49) {
            System.out.println("Second Class");
        }
        else if(per>=39){
            System.out.println("Third Class");
        }
        else {
            System.out.println("You have failed!");
        }


    }
}
