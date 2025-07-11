package ch06_SortAndSearch.day10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int c=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, c, arr));
    }

    private int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(dis(arr,mid) >= c){
                answer = mid;
                lt = mid+1;
            }else{
                rt = mid-1;
            }
        }
        return answer;
    }

    private int dis(int[] arr, int mid) {
        int dis=arr[0];
        int cnt=1;
        for(int x : arr){
            if(x-dis>=mid){
                cnt++;
                dis=x;
            }
        }
        return  cnt;
    }

}
