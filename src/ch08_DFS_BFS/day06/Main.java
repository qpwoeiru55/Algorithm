package ch08_DFS_BFS.day06;

import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] ch, pm, arr;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        pm = new int[m];
        ch = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        T.DFS(0);

    }

    private void DFS(int l) {
        if(l == m){
            for(int x: pm){
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[l] = arr[i];
                    DFS(l+1);
                    ch[i] = 0;

                }

            }
        }


    }
}
