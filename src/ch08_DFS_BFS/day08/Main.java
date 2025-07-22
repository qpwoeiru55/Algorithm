package ch08_DFS_BFS.day08;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[][] dm;
    static int[] pm;
    static int[] ch, ans;
    boolean flag = false;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        dm = new int[35][35];
        pm = new int[n];

        ch = new int[n + 1];
        ans = new int[n];
        for (int i = 0; i < n; i++) {
            pm[i] = combi(n - 1, i);
        }
        T.DFS(0, 0);

    }

    private void DFS(int l, int sum) {
        if (flag) {
            return;
        }
        if (l == n) {
            if (sum == m) {
                for (int x : ans) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i + 1] == 0) {
                    ch[i + 1] = 1;
                    ans[l] = i+1;
                    DFS(l + 1, sum + pm[l] * ans[l]);
                    ch[i + 1] = 0;
                }
            }
        }
    }

    private static int combi(int n, int r) {
        if (dm[n][r] > 0) {
            return dm[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dm[n][r] = combi(n - 1, r) + combi(n - 1, r - 1);
        }
    }


}