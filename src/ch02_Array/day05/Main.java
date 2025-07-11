package ch02_Array.day05;

import java.util.Scanner;

public class Main {
    public int solution(int num){
        int answer = 0;
        int[] arr = new int[num+1];
        for(int i=2; i<=num; i++){
            if(arr[i] == 0){
                answer++;
                for(int j=i; j<=num; j=j+i){
                    if(arr[j]%i ==0){
                        arr[j] = 1;
                    }
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(T.solution(num));
    }
}
