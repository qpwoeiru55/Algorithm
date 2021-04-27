package ch01.ch01_10;

import java.util.Scanner;

public class Main {

    public int[] solution(String s, char a){
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == a) {
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == a) {
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }


        return answer;
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char a = kb.next().charAt(0);
        for(int x : T.solution(str, a)){
            System.out.print(" "+ x);
        }
    }
}
