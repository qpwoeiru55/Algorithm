package String.day05;

import java.util.Scanner;

public class Main {

    public String solution(String string){
        String answer = "";
        char[] s = string.toCharArray();
        int lt = 0;
        int rt = string.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String string = kb.next();
        System.out.println(T.solution(string));

    }
}
