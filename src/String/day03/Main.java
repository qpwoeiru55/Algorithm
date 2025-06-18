package String.day03;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        int mLen = Integer.MIN_VALUE;
        /*String[] strArray = str.split(" ");
        for(String x : strArray){
            int len = x.length();
            if(mLen < len){
                mLen = len;
                answer = x;
            }
        }
        return answer;*/
        int pos;
        while((pos = str.indexOf(" ")) != -1){
             String splitString = str.substring(0,pos);
             int len = splitString.length();
            if(len > mLen){
                mLen = len;
                answer = splitString;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > mLen){
            answer = str;
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
