package ch08_DFS_BFS.day03;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] a;
    static int[] b;
    static int answer;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        a = new int[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.DFS(0, 0, 0);
        System.out.println(answer);
    }

    private void DFS(int sum, int num, int time) {
        if (time > m) {
            return;
        } else if (num == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(sum + a[num], num + 1, time + b[num]);
            DFS(sum, num + 1, time);
        }
    }
}
