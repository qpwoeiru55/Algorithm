package String.day01;

import java.util.*;

public class Main {

    public  int solustion(String strC, char t){
        int answer = 0;
        strC = strC.toLowerCase();
        t = Character.toLowerCase(t);

//        for(int i=0; i<strC.length(); i++){
//            if(strC.charAt(i) == t){
//                answer++;
//            }
//        }
        for(char x : strC.toCharArray()){
            if(x==t){
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.print(T.solustion(str,c));

    }
}

