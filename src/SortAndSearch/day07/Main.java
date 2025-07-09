package SortAndSearch.day07;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for(Point point : list){
            System.out.println(point.x + " " + point.y);
        }

    }
}

class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x){
            return this.y - o.y;
        }else{
            return this.x - o.x;
        }
    }
}
