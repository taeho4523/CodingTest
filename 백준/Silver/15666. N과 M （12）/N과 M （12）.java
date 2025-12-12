import java.io.*;
import java.util.*;


public class Main {
    static int[] arr;
    static int[] arr2;

    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr=new int[n];
        arr2=new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0,0);
    }

    static void dfs(int start, int depth){

        if(depth==m){
            for(int value:arr2){
                System.out.print(value+" ");
            }
            System.out.println();
            return;
        }
        int before=-1;
        for(int i=start; i<n; i++){
            if(arr[i]==before) continue;

            before=arr[i];
            arr2[depth]=arr[i];
            dfs(i,depth+1);

        }

    }
}