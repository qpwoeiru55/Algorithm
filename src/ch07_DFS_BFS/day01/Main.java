package ch07_DFS_BFS.day01;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }

    public void DFS(int i) {
        if(i != 0){
            DFS(i-1);
            System.out.println(i);
        }

    }
}
