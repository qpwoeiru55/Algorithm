package StackQue.day01;

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
        String answer = "NO";
        Stack<Character> characterStack = new Stack<Character>();
        for(char x : str.toCharArray()){
            if(x == '('){
                characterStack.push(x);
            }else{
                if(characterStack.isEmpty()){
                    return answer;
                }
                characterStack.pop();
            }
        }
        if(characterStack.isEmpty()){
            answer = "YES";
        }
        return answer;
    }
}
