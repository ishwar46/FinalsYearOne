package operators;

public class New {
    /*In Artic the temperature is very cold due to which it is very difficult to survive there. But if the
    temperature goes up from -30 ° C we can stay outside for certain time which is given as; for increase in
    every 5 ° C the time to stay outside gets increased by 10 minutes till the temperature is 0 ° C and after
    than we can stay outside as long as we can.
    Using this scenario create a JAVA program where you have to add a function as
    void temperatureStatus(double temperature)
    which provides how much time we can stay outside in the artic region.*/
    public static void main(String[] args) {
        double temperature = -30;
        double time = 0;
        while (temperature > 0) {
            time += 10;
            temperature -= 5;
        }
        System.out.println(time);
    }

}
