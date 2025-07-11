package ch07_DFS_BFS.day03;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(5);
    }

    private int DFS(int i) {
        if(i==1){
            return 1;
        }else{
            return i*DFS(i-1);
        }
    }
}
