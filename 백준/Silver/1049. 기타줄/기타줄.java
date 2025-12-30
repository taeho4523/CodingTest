import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int minUnit = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int pack = Integer.parseInt(st.nextToken());
            int unit = Integer.parseInt(st.nextToken());

            min = Math.min(min, pack);
            minUnit = Math.min(minUnit, unit);
        }

        int result = Math.min(((N / 6) + 1) * min, N * minUnit);
        result = Math.min(result, (N / 6) * min + (N % 6) * minUnit);
        System.out.println(result);
    }
}