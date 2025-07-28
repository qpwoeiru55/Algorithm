package ch08_DFS_BFS.day14;

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
    static int n;
    static int answer;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] arr;
    static Queue<Point> q = new LinkedList<>();

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        T.solution();
        System.out.println(answer);
    }

    private void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1){
                    answer++;
                    q.offer(new Point(i,j));
                    BFS();
                }
            }
        }
    }
    public void BFS(){
        while (!q.isEmpty()){
            Point poll = q.poll();
            for(int i=0; i<8; i++){
                int nx=poll.x+dx[i];
                int ny=poll.y+dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]==1){
                    arr[nx][ny]=0;
                    q.offer(new Point(nx,ny));
                }
            }

        }
    }
}
