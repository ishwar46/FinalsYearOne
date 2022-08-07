package controlstatement;

import java.util.Scanner;

//If Else
public class IfElseStatement {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is smaller than b");
        }
    }
}

//If else of else

class Test{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(a>b){
            System.out.println("True");
        } else if (b>a) {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

//Practice One
//Print city name

class CityName{
    public static void main(String[] args) {
        String city = null;
        String vdc = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter City name : ");
        city = sc.next();
        /*System.out.println("ENter Vdc Name: ");
        vdc = sc.next();*/
        if(city=="Lahan"){
            if (vdc == "Lahan")
            System.out.println("Good");
        } else if (city=="Birat") {
            System.out.println("Good");
        }
        else if (city=="Pkr"){
            System.out.println("Pkr");
        }
        else {
            System.out.println(city);
        }
    }
}