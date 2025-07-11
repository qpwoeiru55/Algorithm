package ch05_StackQue.day03;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=kb.nextInt();
        System.out.println(T.solution(board, moves));
    }

    private int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int x : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][x-1] == 0){
                    continue;
                }else{
                    int tmp = board[i][x-1];
                    board[i][x-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == tmp){
                        answer += 2;
                        stack.pop();
                        break;
                    }else{
                        stack.push(tmp);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
