package Practice;

import java.util.ArrayList;

//write a program to create an arraylist of size 10
//where you have to add integer values and return
//the sum of
//those values which are the multiples 2
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }
        System.out.println(sum);
    }
}
