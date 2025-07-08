package SortAndSearch.day04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(s, n, arr)){
            System.out.print(x+" ");
        }
    }

    private int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];
        for(int x : arr){
            int pos = -1;
            for(int i=0; i<s; i++){
                if(answer[i] == x){
                    pos = i;
                }
            }
            if(pos == -1){
                for(int i=s-1; i>=1; i--){
                    answer[i] = answer[i-1];
                }
            }else{
                for(int i=pos; i>=1; i--){
                    answer[i] = answer[i-1];
                }
            }
            answer[0] = x;
        }
        return answer;
    }
}
