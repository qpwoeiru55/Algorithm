package Array.day04;

import java.util.Scanner;

public class Main {
    public int[] solution(int a){
        int[] Answer = new int[a];
        Answer[0] = 1;
        Answer[1] = 1;
        for(int i=2; i<a; i++){
            Answer[i] = Answer[i-1] + Answer[i-2];
        }
        return Answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int i = kb.nextInt();
        for(int x : T.solution(i)){
            System.out.print(x + " ");
        }

    }
}



/*
public class Main {
    public void solution(int n){
        int a=1, b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        T.solution(n);
    }
}*/
