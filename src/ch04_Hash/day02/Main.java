package ch04_Hash.day02;

import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        String b = kb.nextLine();
        System.out.println(T.solution(a,b));
    }

    private String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : a.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Character c : b.toCharArray()){
            if(!map.containsKey(c) || map.get(c) ==  0){
                answer = "NO";
                break;
            }else{
                map.put(c, map.get(c) - 1);
            }
        }
        return answer;
    }
}
