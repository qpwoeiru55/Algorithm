package ch04.ch04_01;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n, str));
    }

    private char solution(int n, String s) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        //System.out.println(map.containsKey('F'));
        //System.out.println(map.size());
        //System.out.println(map.remove('C'));

        for(char key : map.keySet()){
            //System.out.println(key+" "+map.get(key));
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }




        return answer;
    }
}
