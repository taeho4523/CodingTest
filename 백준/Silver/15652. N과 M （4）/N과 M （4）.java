import java.io.*;
import java.util.*;


public class Main {
    static int n,m;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[m];
        dfs(1,0);
    }

    static void dfs(int start, int depth){
        if(depth==m){
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        else {
            for(int i=start; i<=n; i++){
                arr[depth]=i;
                dfs(i,depth+1);
            }
        }
    }
}