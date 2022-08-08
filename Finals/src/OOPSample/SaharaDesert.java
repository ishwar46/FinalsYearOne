package OOPSample;

import java.util.Scanner;

//In Sahara Desert the temperature is very hot due to which it is very difficult to survive there. But if the
//temperature goes down from 70 ° C we can stay outside for certain time which is given as; for decrease
//in every 5 ° C the time to stay outside gets increased by 10 minutes till the temperature is 40 ° C and
//after than we can stay outside as long as we can.
//Using this scenario create a JAVA program where you have to add a function as
//void temperatureStatus(double temperature)
//which provides how much time we can stay outside in the desert.
public class SaharaDesert {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp= sc.nextDouble();
        SaharaDesert ques=new SaharaDesert();
        ques.temperatureStatus(temp);
    }
    void temperatureStatus(double temperature){
        int time1=0;
        int inital=10;
        int time2=0;
        int time3=0;
        int time4=0;
        int time5=0;
        int time6=0;
        if (temperature>65 && temperature<=70){
            time1=inital*1;
            System.out.println("You can stay for: "+ time1);
        }
        else if(temperature>60 && temperature<=65){
            time2=inital*2;
            System.out.println("You can stay for: "+ time2);
        }
        else if(temperature>55 && temperature<=60){
            time3=inital*3;
            System.out.println("You can stay for: "+time3);
        }
        else if(temperature>50 && temperature<=55){
            time4=inital*4;
            System.out.println("You can stay for: "+ time4);
        }
        else if(temperature>45 && temperature<=50){
            time5=inital*5;
            System.out.println("You can stay for: "+time5);
        }
        else if(temperature>40 && temperature<=45){
            time6=inital*6;
            System.out.println("You can stay for: "+time6);
        }
        else if(temperature>70){
            System.out.println("You cannot stay out");
        }
        else {
            System.out.println("You can stay as long as you want to");
        }

    }
}
class SaharaDesertTwo {
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



        if (temperature == (70) && temperature > (70)) {
            System.out.println("you cannot stay longer");
        } else if (temperature < 70 && temperature >= (65)) {
            time1 = ini_time;
            System.out.println("you can stay upto: " + time1 + "mins");
        } else if (temperature < (65) && temperature >= (60)) {
            time2 = time1 + ini_time;
            System.out.println("you can stay upto: " + time2 + "minutes more");
        } else if (temperature < (60) && temperature >= (55)) {
            time3 = time2 + ini_time;
            System.out.println("you can stay upto: " + time3 + "minutes more");
        } else if (temperature < (55) && temperature >= (50)) {
            time4 = time3 + ini_time;
            System.out.println("you can stay upto: " + time4 + "minutes more");
        } else if (temperature < (50) && temperature >= (45)) {
            time5 = time4 + ini_time;
            System.out.println("you can stay upto: " + time5 + "minutes more");
        } else if (temperature < 40){
            System.out.println("You can stay longer");
        }

    }
}
