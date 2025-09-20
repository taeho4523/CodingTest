import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());


        int[] count0 = new int[41];
        int[] count1 = new int[41];

        count0[0] = 1; count1[0] = 0;
        count0[1] = 0; count1[1] = 1;

        for (int i = 2; i <= 40; i++) {
            count0[i] = count0[i-1] + count0[i-2];
            count1[i] = count1[i-1] + count1[i-2];
        }


        for (int t = 0; t < N; t++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(count0[n]).append(" ").append(count1[n]).append("\n");
        }

        System.out.print(sb);
    }
}
