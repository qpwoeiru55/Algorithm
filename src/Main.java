import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
    }

    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Arrays.sort(a);
        Arrays.sort(b);
        int ia = 0;
        int ib = 0;
        while(ia <n && ib < m){
            if(a[ia] == b[ib]){
                answer.add(a[ia]);
                ia++;
                ib++;
            }else if(a[ia] > b[ib]){
                ib++;
            }else{
                ia++;
            }

        }





        return answer;
    }
}


