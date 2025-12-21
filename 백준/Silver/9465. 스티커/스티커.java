import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int col = Integer.parseInt(br.readLine());
            arr = new int[2][col];
            dp = new int[2][col];

            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < col; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

           
            if (col == 1) {
                System.out.println(Math.max(arr[0][0], arr[1][0]));
                continue;
            }

            dp[0][0] = arr[0][0];
            dp[1][0] = arr[1][0];
            dp[0][1] = dp[1][0] + arr[0][1];
            dp[1][1] = dp[0][0] + arr[1][1];

            for (int i = 2; i < col; i++) {
                dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + arr[0][i];
                dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + arr[1][i];
            }

            int result = Math.max(dp[0][col - 1], dp[1][col - 1]);
            System.out.println(result);
        }
    }
}
