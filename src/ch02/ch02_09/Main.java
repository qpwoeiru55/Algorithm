package ch02.ch02_09;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr){
    int answer = Integer.MIN_VALUE;
    int sum = 0;
    int sum2 = 0;
    for(int i=0; i<n; i++){
        sum = sum2 = 0;
        for(int j=0; j<n; j++){
            sum += arr[i][j];
            sum2 += arr[j][i];
        }
        answer = Math.max(answer,sum);
        answer = Math.max(answer,sum2);
    }

    sum = sum2 = 0;
    for(int i=0; i<n; i++){
        sum += arr[i][i];
        sum2 += arr[i][n-i-1];
    }
    answer = Math.max(answer,sum);
    answer = Math.max(answer,sum2);

    return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
