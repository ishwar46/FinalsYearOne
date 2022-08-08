package string;

import java.util.Scanner;

public class Angram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean isAnagram = false;
        if(a.length() == b.length()) {
            for(int i=0; i<a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;
                for(int j=0; j<a.length(); j++) {
                    if(b.charAt(j) == c) {
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram) {
                    break;
                }
            }
        }
        if(isAnagram) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
}}
