package Hash.day04;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(T.solution(a, b));
    }

    private int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int lena = a.length();
        int lenb = b.length();
        int lt=0;

        for(int i = 0; i < lenb-1; i++){
            map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0) + 1);
        }
        for(Character x : b.toCharArray()){
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for(int i = lenb-1; i<lena; i++){
            map1.put(a.charAt(i) , map1.getOrDefault(a.charAt(i), 0) + 1);
            if(map1.equals(map2)){
                answer++;
            }
            map1.put(a.charAt(lt), map1.get(a.charAt(lt)) - 1);
            if(map1.get(a.charAt(lt)) == 0){
                map1.remove(a.charAt(lt));
            }
            lt++;
        }
        return answer;
    }
}
