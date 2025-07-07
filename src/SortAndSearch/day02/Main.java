package SortAndSearch.day02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(n, arr)) System.out.print(x+" ");
    }

    private int[] solution(int n, int[] arr) {
        for(int i=0; i<n; i++){
        int tmp;
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
