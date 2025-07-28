package ch08_DFS_BFS.day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int n, m;
    static int[][] board, dis;
    static Queue<Point> Q;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) {
                    Q.offer(new Point(i, j));
                }
            }
        }
        T.BFS();

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 0){
                    flag = false;
                }
            }
        }
        if(flag){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(dis[i][j], answer);
                }
            }
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }

    }

    private void BFS() {
        while (!Q.isEmpty()) {
            Point poll = Q.poll();
            for (int i = 0; i < 4; i++) {
                int xx = poll.x + dx[i];
                int yy = poll.y + dy[i];
                if (xx >= 0 && yy >= 0 && xx<n && yy<m && board[xx][yy] == 0){
                    board[xx][yy] = 1;
                    Q.offer(new Point(xx,yy));
                    dis[xx][yy] = dis[poll.x][poll.y]+1;
                }
            }
        }

    }


}
