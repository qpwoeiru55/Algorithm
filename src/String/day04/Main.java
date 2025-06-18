package String.day04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] stringList){
        /*ArrayList<String> stringArrayList = new ArrayList<>();

        for(String x : stringList){
            String tmp = new StringBuilder(x).reverse().toString();
            stringArrayList.add(tmp);
        }
        return stringArrayList;*/


        ArrayList<String> arrayList = new ArrayList<>();
        for(String x : stringList){
            int lt = 0;
            int rt = x.length()-1;
            char[] chars = x.toCharArray();
            while (lt<rt){
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            arrayList.add(String.valueOf(chars));
        }
        return arrayList;

    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] strings = new String[n];
        for(int i=0; i<n; i++) {
            strings[i] = kb.next();
        }

        System.out.println(T.solution(n,strings));
    }
}
