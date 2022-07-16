package operators;
//Write a program to check whether a person can cast a vote or not. Condition is you must
// be above 18 years to vote.
public class TaskOne{
    public static void main(String[] args) {
        int age = 17;
        String result;
        result = (age==18)? "You cant vote" : "You can Vote";
        System.out.println(result);
    }
}

//Next Method
