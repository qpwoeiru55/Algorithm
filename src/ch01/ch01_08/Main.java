package ch01.ch01_08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase(Locale.ROOT).replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
