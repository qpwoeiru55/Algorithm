package ch01_String.day12;

import java.util.Scanner;

class Main {
    public String solution(int n, String s) {
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = s.substring(i*7,i*7+7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer+=(char)num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}