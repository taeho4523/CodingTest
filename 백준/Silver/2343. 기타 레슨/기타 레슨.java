import java.io.*;
import java.util.*;

public class Main {
    static int N,M,max,min;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        arr=new int[N];
        st=new StringTokenizer(br.readLine());
        int sum=0;
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i];
            min=Math.max(arr[i],min);
        }

        max=sum;

        System.out.println(binarySearch(min,max));

    }

    public static long binarySearch(long left,long right){
        while(left<=right){
            long sum=0;
            long mid=(left+right)/2;
            int count=1;
            for(int i=0;i<N;i++){
                sum+=arr[i];
                if(sum>mid){
                    sum=arr[i];
                    count++;
                }
            }
            if(count<=M){
                right=mid-1;
            } else left=mid+1;
        }
        return left;
    }
}
