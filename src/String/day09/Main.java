package String.day09;

import java.util.Scanner;

public class Main {

/*    public int solution(String str) {
        int answer = 0;
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                answer = 10*answer + Character.getNumericValue(x);
            }
        }
        return answer;
    }*/

    public int solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
