package ch01.ch01_07;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "YES";
//        str = str.toUpperCase(Locale.ROOT);
//        int len = str.length();
//        for(int i =0; i < len/2; i++){
//             if(str.charAt(i) != str.charAt(len-1-i)){
//                 answer = "false";
//                 break;
//             }
//        }

        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)){
            answer = "false";
        }



        return answer;
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
