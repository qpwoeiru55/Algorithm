package ch05.ch05_01;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "Yes";
        Stack<Character> stack = new Stack<Character>();
        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            }else{
                if(stack.isEmpty()){
                    answer = "NO";
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            answer = "NO";
        }



        return answer;
    }
}
