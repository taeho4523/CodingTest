
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int originalN = N;
		int count = 0;

		do {
			int sum = (N / 10) + (N % 10);
			N = (N % 10) * 10 + (sum % 10);
			count++;
		} while (originalN != N);

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
