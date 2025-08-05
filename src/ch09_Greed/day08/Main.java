package ch09_Greed.day08;

import java.util.*;

class Edge implements Comparable<Edge> {
    public int vex;
    public int cost;

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int answer = 0;
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] ch = new int[n+1];
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }
        for(int i=0; i<m; i++){
            int a= kb.nextInt();
            int b= kb.nextInt();
            int c= kb.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        PriorityQueue<Edge> q = new PriorityQueue<>();
        q.offer(new Edge(1,0));
        while(!q.isEmpty()){
            Edge poll = q.poll();
            if(ch[poll.vex] == 0){
                ch[poll.vex] = 1;
                answer += poll.cost;
            }
            for(Edge x : graph.get(poll.vex)){
                if(ch[x.vex] == 0){
                    q.offer(x);
                }
            }
        }
        System.out.println(answer);
    }
}