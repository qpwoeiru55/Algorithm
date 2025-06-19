package String.day07;

import java.util.Scanner;

public class Main {
    public String solution(String string){
        /*String answer = "TRUE";
        string = string.toLowerCase();
        char[] chars = string.toCharArray();
        for(int i=0; i<string.length()/2; i++){
            if(chars[i] != chars[string.length()-1-i]){
                answer = "FALSE";
                break;
            }
        }*/


        String answer = "FALSE";

        if(new StringBuilder(string).reverse().toString().equalsIgnoreCase(string)){
            answer = "true";
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
