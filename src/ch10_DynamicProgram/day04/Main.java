package ch10_DynamicProgram.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Block implements Comparable<Block> {
    public int s, h, w;
    Block(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    public int compareTo(Block o) {
        return o.s - this.s;
    }

}

public class Main {
    static int n;
    static int[] dy;
    static ArrayList<Block> arr;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        arr = new ArrayList<>();
        n = kb.nextInt();
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Block(a, b, c));
        }
        Collections.sort(arr);
        System.out.println(solution());

    }

    private static int solution() {
        int answer = 0;
        dy[0] = arr.get(0).h;
        answer=dy[0];
        for (int i = 1; i < n; i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
}
