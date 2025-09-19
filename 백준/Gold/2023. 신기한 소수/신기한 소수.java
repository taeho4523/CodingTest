import java.io.*;
import java.util.*;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] first={2,3,5,7};

        n = Integer.parseInt(br.readLine());

        for(int i=0; i<first.length; i++){
            dfs(first[i],1);
        }
    }

    public static void dfs(int num,int len) {
        if(len==n){
            System.out.println(num);
            return;
        }
        for(int a=1; a<=9; a+=2){
            int next=num*10+a;
            if(isPrime(next)){
                dfs(next,len+1);
            }
        }
    }
    static boolean isPrime(int x){
        if(x<2){
            return false;
        }
        for(int i=2; i<x; i++){
            if(x%i==0) return false;
        }
        return true;
    }
}