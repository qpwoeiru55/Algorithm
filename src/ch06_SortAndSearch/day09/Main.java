package ch06_SortAndSearch.day09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(mid,arr) <= m){
                answer = mid;
                rt = mid-1;
            }else{
                lt = mid +1 ;
            }

        }

        return answer;
    }

    private int count(int mid, int[] arr) {
        int cnt = 1;
        int sum = 0;
        for(int x : arr){
            if(sum+x > mid){
                cnt++;
                sum=x;
            }else{
                sum+=x;
            }
        }
        return cnt;
    }
}
