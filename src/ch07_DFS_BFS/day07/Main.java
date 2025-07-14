package ch07_DFS_BFS.day07;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node lt, rt;

    public Node(int val) {
        this.val = val;
        lt=rt=null;
    }
}

public class Main {
    Node root;
    public static void main(String[] args) {
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.BFS(tree.root);

    }

    private void BFS(Node root) {
       Queue<Node> queue = new LinkedList<>();
       queue.offer(root);
       while (!queue.isEmpty()){
            int len = queue.size();
            String  tmp = "";
            for(int i=0; i<len; i++){
                Node poll = queue.poll();
                if(poll.lt != null){
                    queue.offer(poll.lt);
                }
                if(poll.rt != null){
                    queue.offer(poll.rt);
                }
                tmp += poll.val + " ";
            }
           System.out.println(tmp);
       }
    }
}
