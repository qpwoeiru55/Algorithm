package ch07_DFS_BFS.day10;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data=val;
        lt=rt=null;
    }
}

public class Main{
    Node root;
    public int BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int answer = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i=0; i<len; i++){
                Node poll = queue.poll();
                if(poll.lt == null && poll.rt ==null){
                    return answer;
                }
                if(poll.lt != null){
                    queue.offer(poll.lt);
                }
                if(poll.rt != null){
                    queue.offer(poll.rt);
                }
            }
            answer++;
        }
        return 0;
    }

    public static void main(String args[]) {
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}