package ch09_Greed.day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    int h, w;

    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.w - this.w;
    }
}

public class Main {
    static int n;
    static ArrayList<Body> arr;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        arr = new ArrayList<>();
        n = kb.nextInt();
        for(int i=0; i<n; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            arr.add(new Body(a,b));
        }
        Collections.sort(arr);
        System.out.println(T.solution());
    }

    private int solution() {
        int answer = 0;
        int et = 0;
        for(Body x: arr){
            if(et < x.h){
                et = x.h;
                answer++;
            }
        }

        return answer;
    }
}
