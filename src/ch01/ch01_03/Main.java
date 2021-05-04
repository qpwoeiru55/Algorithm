package ch01.ch01_03;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
//        String[] s = str.split(" ");
//        for(String x : s){
//            int len = x.length();
//            if(len>m){
//                  m = len;
//                answer = x;
//            }
//        }


        while((pos = str.indexOf(" ")) != -1){
            String temp = str.substring(0, pos);
            int len = temp.length();
            if(len > m){
                m = len;
                answer = temp;
            }

            str = str.substring(pos+1);
        }
        if(str.length() > m){
            answer = str;
        }
        return answer;
    }

    public static void main(String args []){
        Main T = new Main();

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
