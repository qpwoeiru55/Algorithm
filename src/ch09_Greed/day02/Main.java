package ch09_Greed.day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int s;
    int e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    public int compareTo(Time o) {
        if (this.e == o.e) {
            return this.s - o.s;
        } else {
            return this.e - o.e;
        }
    }

}
class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Time(x, y));
        }
        Collections.sort(arr);
        System.out.println(T.solution(arr, n));
    }

    private int solution(ArrayList<Time> arr, int n) {
        int answer =0;
        int e = 0;
        for(Time x : arr){
            if(x.s >= e){
                answer++;
                e= x.e;
            }
        }

        return answer;
    }
}