package ch08_DFS_BFS.day15;

import java.util.*;

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;
    static int[][] arr;
    static ArrayList<Point> h, p;
    static int[] combi;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        h = new ArrayList<>();
        p = new ArrayList<>();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
                if (arr[i][j] == 1){
                    h.add(new Point(i, j));
                }
                else if (arr[i][j] == 2){
                    p.add(new Point(i, j));
                }
            }
        }

        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }

    private void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point house : h) {
                int dist = Integer.MAX_VALUE;
                for (int i : combi) {
                    dist = Math.min(dist, Math.abs(house.x - p.get(i).x) + Math.abs(house.y - p.get(i).y));
                }
                sum += dist;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < p.size(); i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
}
