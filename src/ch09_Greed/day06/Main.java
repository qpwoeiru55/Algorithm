package ch09_Greed.day06;

import java.util.*;

class Main {
    static int[] unf;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            union(a, b);
        }
        int a = kb.nextInt();
        int b = kb.nextInt();
        int fa = find(a);
        int fb = find(b);

        if(fa == fb){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if(fa != fb){
            unf[fa] = fb;
        }
    }

    private static int find(int a) {
        if(unf[a] == a){
            return a;
        }else{
            return unf[a] = find(unf[a]);
        }

    }
}