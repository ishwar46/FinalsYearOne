package OOPSample;

import java.util.Scanner;

//In Sahara Desert the temperature is very hot due to which it is very difficult to survive there. But if the
//temperature goes down from 70 ° C we can stay outside for certain time which is given as; for decrease
//in every 5 ° C the time to stay outside gets increased by 10 minutes till the temperature is 40 ° C and
//after than we can stay outside as long as we can.
//Using this scenario create a JAVA program where you have to add a function as
//void temperatureStatus(double temperature)
//which provides how much time we can stay outside in the desert
public class SaharaDesert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        temperatureStatus(temperature);
    }

    public static void temperatureStatus(double temperature) {
        int time1 = 0;
        int ini_time = 10;
        int time2 = 0;
        int time3 = 0;
        int time4 = 0;
        int time5 = 0;
        int time6 = 0;
        int time7 = 0;
        int time8 = 0;
        int time9 = 0;
        int time10 = 0;
        int time11 = 0;
        int time12 = 0;
        int time13 = 0;
        int time14 = 0;
        int time15 = 0;
        int time16 = 0;
        int time17 = 0;
        int time18 = 0;
        int time19 = 0;
        int time20 = 0;
        int time21 = 0;
        int time22 = 0;
        int time23 = 0;
        int time24 = 0;
        int time25 = 0;
        int time26 = 0;
        int time27 = 0;
        int time28 = 0;
        int time29 = 0;
        int time30 = 0;
        int time31 = 0;
        int time32 = 0;
        int time33 = 0;
        int time34 = 0;
        int time35 = 0;
        int time36 = 0;
        int time37 = 0;
        int time38 = 0;
        int time39 = 0;
        int time40 = 0;
        int time41 = 0;
        int time42 = 0;
        int time43 = 0;
        int time44 = 0;
        int time45 = 0;
        int time46 = 0;
        int time47 = 0;
        int time48 = 0;
        int time49 = 0;
        int time50 = 0;
        int time51 = 0;
        int time52 = 0;
        int time53 = 0;
        int time54 = 0;
        int time55 = 0;
        int time56 = 0;
        int time57 = 0;
        int time58 = 0;
        int time59 = 0;
        int time60 = 0;
        int time61 = 0;

        if (temperature > (40) && temperature <= (45)) {
            time1 = ini_time;
            System.out.println("you can stay upto :" + time1 + "minutes more");
        } else if (temperature > (45) && temperature <= (50)) {
            time2 = time1 + ini_time;
            System.out.println("you can stay upto: " + time2 + "minutes more");
        } else if (temperature > (50) && temperature <= (55)) {
            time3 = time2 + ini_time;
            System.out.println("you can stay upto: " + time3 + "minutes more");
        } else if (temperature > (55) && temperature <= (60)) {
            time4 = time3 + ini_time;
            System.out.println("you can stay upto: " + time4 + "minutes more");
        } else if (temperature > (60) && temperature <= (65)) {
            time5 = time4 + ini_time;
            System.out.println("you can stay upto: " + time5 + "minutes more");
        } else if (temperature > (65) && temperature <= (70)) {
            time6 = time5 + ini_time;
            System.out.println("you can stay upto: " + time6 + "minutes more");
        } else if (temperature > (70) && temperature <= (75)) {
            time7 = time6 + ini_time;
            System.out.println("you can stay upto: " + time7 + "minutes more");
        } else if (temperature > (75) && temperature <= (80)) {
            time8 = time7 + ini_time;
            System.out.println("you can stay upto: " + time8 + "minutes more");
        } else if (temperature > (80) && temperature <= (85)) {
            time9 = time8 + ini_time;
            System.out.println("you can stay upto: " + time9 + "minutes more");

        }
    }
}
