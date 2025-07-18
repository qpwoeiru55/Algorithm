package ch08_DFS_BFS.day02;

import java.util.Scanner;

public class Main {
    static int answer = Integer.MIN_VALUE;
    static int c, n;
    static int[] arr;


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0, 0);
        System.out.println(answer);
    }

    private void DFS(int num, int sum) {
        if (sum > c) {
            return;
        } else if (num == n) {
            answer = Math.max(sum, answer);
        } else{
            DFS(num + 1, sum + arr[num]);
            DFS(num + 1, sum);
        }

    }
}
