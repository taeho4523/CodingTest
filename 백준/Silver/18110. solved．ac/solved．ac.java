import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int out = (int) Math.round(n*0.15);

        double sum=0;
        for (int i=out; i<n-out; i++){
            sum+=arr[i];
        }

        int result=(int)Math.round(sum/(n-out*2));
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
