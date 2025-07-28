package ch08_DFS_BFS.day13;

import java.util.Scanner;

public class Main {
    static int n;
    static int answer;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] arr;

    public static void main(String[] args) {
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
                if (arr[i][j] == 1) {
                    answer++;
                    arr[i][j] = 0;
                    DFS(i,j);
                }

            }
        }

    }
    public void DFS(int x, int y){
        for(int i=0; i<8; i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]==1){
                arr[nx][ny]=0;
                DFS(nx, ny);
            }
        }
    }
}
