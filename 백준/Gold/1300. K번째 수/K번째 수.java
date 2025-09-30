
import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());

		long low = 1;
		long high = k;
		long ans = 0;

		while (low <= high) {
			long mid = (low + high) / 2;
			long count = 0;

			for (int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
			}

			if (count >= k) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		System.out.println(ans);
	}
}
