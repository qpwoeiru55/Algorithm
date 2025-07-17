package ch07_DFS_BFS.day13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m, answer;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n  = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        ch = new int[n+1];

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }

    private static void DFS(int i) {
        if(i == n){
            answer++;
        }else{
            for(Integer x : graph.get(i)){
                if(ch[x] != 1){
                    ch[x] = 1;
                    DFS(x);
                    ch[x] = 0;
                }
            }
        }
    }
}
