package ch01_String.day06;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "";
        char[] chars = str.toCharArray();
        for(int i =0; i<str .length(); i++){
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String string = kb.next();
        System.out.println(T.solution(string));

    }
}
