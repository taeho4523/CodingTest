
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[5];
		int result=0;
		for(int i=0; i<5; i++){
			arr[i]=Integer.parseInt(br.readLine());
			result+=arr[i];
		}
		int avg = result/5;
		bw.write(String.valueOf(avg)+"\n");
		Arrays.sort(arr);
		bw.write(String.valueOf(arr[2]));
		br.close();
		bw.flush();
		bw.close();

	}
}