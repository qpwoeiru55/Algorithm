package StackQue.day02;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        Stack<Character> characterStack = new Stack<Character>();
        for(char x : str.toCharArray()){
            if(x == '('){
                characterStack.push(x);
            }else if (Character.isAlphabetic(x)) {
                if(!characterStack.isEmpty()){
                    continue;
                }else{
                    answer += x;
                }
            }else if (x == ')') {
                characterStack.pop();
            }
        }
        return answer;
    }
}
