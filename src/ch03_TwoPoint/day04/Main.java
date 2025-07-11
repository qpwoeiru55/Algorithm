package ch03_TwoPoint.day04;

import java.util.*;
class Main {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int p1 = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum == m){
                answer++;
            }
            while(sum >= m){
                sum -= arr[p1];
                p1++;
                if(sum == m){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}