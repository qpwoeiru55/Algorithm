package ch10_DynamicProgram.day03;

import java.util.Scanner;

public class Main {
    static int[] arr, dy;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        arr = new int[n];
        dy = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n));
    }

    private int solution(int n) {
        int answer = 0;
        dy[0] = 1;
        for(int i=1; i<n; i++){
            int max=0;
            for(int j=i-1; j>=0; j--){
                if(arr[i] > arr[j] && dy[j] > max){
                    max = dy[j];
                }
            }
            dy[i] = max+1;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
}
