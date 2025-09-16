
import java.util.*;
import java.io.*;

class Main {
	static class Pair{
		int value;
		int index;
		Pair(int value, int index){
			this.value = value;
			this.index = index;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Pair[] arr = new Pair[N];
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = new Pair(num, i); //값, 인덱스
		}
		Arrays.sort(arr, Comparator.comparingInt(o -> o.value));

		int answer= 0;
		for (int i = 0; i < N; i++) {
			answer = Math.max(answer,arr[i].index-i); // arr[i].index 는 정렬 전 인덱스, i는 정렬 후 인덱스를 나타냄
		}
		bw.write(String.valueOf(answer+1));
		bw.flush();


	}
}
