import java.util.*;


public class Main{
    static int answer;
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    static int[][] pm;

    public static void main(String[] args){
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        pm = new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                pm[i][j] = kb.nextInt();
            }
        }
        pm[1][1] = 1;
        T.DFS(1,1);
        System.out.println(answer);
    }

    private void DFS(int x, int y) {
        if(x == 7 && y ==7){
            answer++;
        }else{
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && pm[nx][ny]==0){
                    pm[nx][ny] = 1;
                    DFS(nx,ny);
                    pm[nx][ny] = 0;

                }
            }
        }
    }
}


