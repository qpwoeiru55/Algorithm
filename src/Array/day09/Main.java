package Array.day09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] ints = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                ints[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, ints));


    }

    public int solution(int n, int[][] ints) {
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int suma = 0;
            int sumb = 0;
            for(int j=0; j<n; j++) {
                suma += ints[i][j];
                sumb += ints[j][i];
            }
            answer = Math.max(suma,answer);
            answer = Math.max(sumb,answer);
        }
        int sumaa = 0;
        int sumbb = 0;
        for(int i=0; i<n; i++){
            sumaa += ints[i][i];
            sumbb += ints[i][n-1-i];
        }
        answer = Math.max(sumaa,answer);
        answer = Math.max(sumbb,answer);

        return answer;
    }
}
