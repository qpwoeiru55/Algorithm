package ch07.ch07_02;

public class Main {

    public static void main(String[] args){
        Main T = new Main();
        T.DFS(11);
    }

    private void DFS(int i) {
        if(i == 0){
            return;
        }else{
            DFS(i/2);
            System.out.print(i%2);
        }
    }
}
