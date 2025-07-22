package ch08_DFS_BFS.day09;

import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] combi;

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        combi=new int[m];
        T.DFS(0, 1);
    }

    private void DFS(int l, int i) {
        if(l == m){
            for(int x: combi){
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for(int j=i; j<=n; j++){
                combi[l] = j;
                DFS(l+1, j+1);
            }
        }
    }

}
