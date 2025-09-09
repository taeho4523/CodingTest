import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long count = 0;
		long[] sum = new long[n + 1];
		long[] division = new long[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + num;

            int remainder = (int)((sum[i] % m + m) % m);
            if (remainder == 0) count++;
            division[remainder]++;
		}

		for (int i = 0; i < m; i++) {
			if (division[i] > 1) count += (division[i] * (division[i] - 1) / 2);
		}

		System.out.println(count);
	}
}