package ch07_DFS_BFS.day08;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int val;
    Node lt, rt;

    public Node(int val) {
        this.val = val;
        lt = rt = null;
    }
}
public class Main {

    public static void main(String[] args) {
        Main tree = new Main();
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(tree.BFS(a,b));

    }

    private int BFS(int a, int b) {
        Queue<Integer> q = new LinkedList<>();
        int[] dis={1, -1, 5};
        int[] x = new int[10000];
        x[a] = 1;
        int answer =0;
        q.offer(a);
        while (!q.isEmpty()){
            int len = q.size();
            for(int j=0; j<len; j++){
                int tmp = q.poll();
                for (int di : dis) {
                    if (tmp + di == b) {
                        return answer+1;
                    }
                    if(tmp + di>=1 && tmp + di<=10000 && x[tmp + di]==0){
                        x[tmp + di]=1;
                        q.offer(tmp + di);
                    }
                }
            }
            answer++;
        }
        return 0;
    }
}
