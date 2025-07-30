package ch09_Greed.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int t;
    char k;

    public Time(int t, char k) {
        this.t = t;
        this.k = k;
    }

    public int compareTo(Time o){
        if(this.t == o.t){
            return this.k - o.k;
        }else{
            return this.t - o.t;
        }

    }

}

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int s=kb.nextInt();
            int e=kb.nextInt();
            arr.add(new Time(s, 's'));
            arr.add(new Time(e, 'e'));
        }
        System.out.println(T.solution(arr));
    }

    private int solution(ArrayList<Time> arr) {
        int answer=0;
        int cnt=0;
        Collections.sort(arr);
        for(Time x : arr){
            if(x.k == 's'){
                cnt++;
            }else{
                cnt--;
            }
            answer = Math.max(answer,cnt);
        }
        return answer;
    }
}
