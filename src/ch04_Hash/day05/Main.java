package ch04_Hash.day05;


import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(a, b, arr));
    }

    private int solution(int a, int b, int[] arr) {
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<a; i++){
            for(int j=i+1; j<a; j++){
                for(int k=j+1; k<a; k++){
                    treeSet.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt = 1;
        for(int x : treeSet){
            if(cnt == b){
                answer = x;
                break;
            }
            cnt++;
        }


        return answer;
    }
}
