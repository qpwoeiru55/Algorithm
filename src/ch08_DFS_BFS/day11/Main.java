package ch08_DFS_BFS.day11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int n = 7;
    static int[][] board;
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        board = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                board[i][j] = kb.nextInt();
            }
        }
        board[0][0] = 1;
        BFS(0,0);
        if(board[n-1][n-1] == 0){
            System.out.println(-1);
        }
    }

    private static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y));
        while (!q.isEmpty()){
            Point poll = q.poll();
            for(int i=0; i<4; i++){
                int xx = poll.x + dx[i];
                int yy = poll.y + dy[i];
                if(xx >= 0 && yy>=0 && xx<n && yy<n && board[xx][yy] == 0){
                    board[xx][yy] = board[poll.x ][poll.y]+1;
                    q.offer(new Point(xx,yy));
                    if(xx == n-1 && yy ==n-1){
                        System.out.println(board[xx][yy]-1);
                    }
                }
            }
        }

    }
}
