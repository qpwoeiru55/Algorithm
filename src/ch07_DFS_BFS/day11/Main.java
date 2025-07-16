package ch07_DFS_BFS.day11;

import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int n;
    static int m;
    static int answer = 0;
    static int[] ch;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            arr[a][b] = 1;
        }
        ch[1] = 1;
        T.DSF(1);
        System.out.println(answer);
    }

    private void DSF(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (arr[v][i] == 1 && ch[i] != 1) {
                    ch[i] = 1;
                    DSF(i);
                    ch[i] = 0;
                }
            }
        }
    }
}

