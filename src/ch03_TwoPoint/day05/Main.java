package ch03_TwoPoint.day05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int i = kb.nextInt();
        System.out.println(T.solution(i));
    }

    private int solution(int n) {
        int answer = 0;
        int p1 = 0;
        int m = n/2+1;
        int sum = 0;
        int[] arr = new int[m];

        for(int i=0;i<m; i++){
            arr[i] = i+1;
        }
        for(int j=0; j<m; j++){
            sum += arr[j];
            if(sum == n){
                answer++;
            }
            while (sum > n){
                sum -= arr[p1];
                p1++;
                if(sum == n){
                    answer++;
                }
            }
        }
        return answer;
    }
}
