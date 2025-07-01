package Hash.day03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
    }

    private ArrayList<Integer>  solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<k-1; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=k-1; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            answer.add(map.size());
            map.put(arr[i+1-k], map.get(arr[i+1-k])-1);
            if(map.get(arr[i+1-k]) == 0){
                map.remove(arr[i+1-k]);
            }
        }
        return answer;
    }
}
