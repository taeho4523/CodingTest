import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] arr;
    static int result=0;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N=Integer.parseInt(br.readLine());
        arr=new int[N];
        dfs(0);
        System.out.println(result);
    }

    public static void dfs(int count){
        if(count==N){
            result++;
            return;
        }

        for(int i=0; i<N; i++){
            arr[count]=i;
            if(possible(count)){
                dfs(count+1);
            }
        }


    }
    public static boolean possible(int count){
        for(int i=0; i<count; i++){
            if(arr[i]==arr[count]) return false;
            else if(Math.abs(count-i) == Math.abs(arr[count]-arr[i])) return false;
        }
        return true;
    }

}
