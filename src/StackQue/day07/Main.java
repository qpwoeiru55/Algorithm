package StackQue.day07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.println(T.solution(a, b));
    }

    private String solution(String a, String b) {
        String answer ="YES";
        Queue<Character> queue = new LinkedList<>();
        for(char x : a.toCharArray()){
            queue.offer(x);
        }
        for(char x : b.toCharArray()){
            if(queue.contains(x)){
                if(queue.poll() != x){
                    answer = "NO";
                    break;
                }
            }
        }
        if(!queue.isEmpty()){
            answer = "NO";
        }

        return answer;
    }
}
