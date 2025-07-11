package ch02_Array.day10;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] ints) {
        int answer = 0;
        int [] dx = {0,1,0,-1};
        int [] dy = {1,0,-1,0};
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                boolean pass = true;
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && ints[nx][ny] >= ints[i][j]){
                        pass = false;
                        break;
                    }
                }
                if(pass){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb= new Scanner(System.in);
        int n = kb.nextInt();
        int[][] ints = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                ints[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,ints));

    }


}
