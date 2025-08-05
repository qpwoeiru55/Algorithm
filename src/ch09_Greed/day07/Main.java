package ch09_Greed.day07;

import java.util.*;

class Edge implements Comparable<Edge> {
    int a;
    int b;
    int c;

    public Edge(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int compareTo(Edge o) {
        return this.c - o.c;
    }
}

class Main {
    static int[] unf;
    static int answer =0;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n + 1];
        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Edge(a,b,c));
        }
        Collections.sort(arr);
        for(Edge x : arr){
            int a = x.a;
            int b = x.b;
            int c = x.c;

            int fa = find(a);
            int fb = find(b);

            if(fa != fb){
                union(a,b);
                answer += c;
            }
        }
        System.out.println(answer);
    }

    private static void union(int a, int b) {
        if(find(a) != find(b)){
            unf[find(a)] = find(b);
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