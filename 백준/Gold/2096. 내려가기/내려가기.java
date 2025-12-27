import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr= new int[n][3];
        int[][] dp_max= new int[n][3];
        int[][] dp_min= new int[n][3];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=Integer.parseInt(st.nextToken());
        }
        dp_max[0][0]=arr[0][0];
        dp_max[0][1]=arr[0][1];
        dp_max[0][2]=arr[0][2];
        dp_min[0][0]=arr[0][0];
        dp_min[0][1]=arr[0][1];
        dp_min[0][2]=arr[0][2];

        for(int i=1; i<n; i++) {
            dp_max[i][0]=Math.max(arr[i][0]+dp_max[i-1][0],arr[i][0]+dp_max[i-1][1]);
            dp_max[i][1]=Math.max(arr[i][1]+dp_max[i-1][1],Math.max(arr[i][1]+dp_max[i-1][2],arr[i][1]+dp_max[i-1][0]));
            dp_max[i][2]=Math.max(arr[i][2]+dp_max[i-1][1],arr[i][2]+dp_max[i-1][2]);

            dp_min[i][0]=Math.min(arr[i][0]+dp_min[i-1][0],arr[i][0]+dp_min[i-1][1]);
            dp_min[i][1]=Math.min(arr[i][1]+dp_min[i-1][1],Math.min(arr[i][1]+dp_min[i-1][2],arr[i][1]+dp_min[i-1][0]));
            dp_min[i][2]=Math.min(arr[i][2]+dp_min[i-1][1],arr[i][2]+dp_min[i-1][2]);

        }
        int max=Math.max(dp_max[n-1][2],Math.max(dp_max[n-1][0],dp_max[n-1][1]));
        int min=Math.min(dp_min[n-1][2],Math.min(dp_min[n-1][0],dp_min[n-1][1]));

        System.out.println(max+" "+min);
    }

}