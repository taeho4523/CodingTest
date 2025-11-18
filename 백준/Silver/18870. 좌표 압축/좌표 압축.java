import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		int[] sortedArr=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i]=Integer.parseInt(st.nextToken());
			sortedArr[i]=arr[i];
		}

		Arrays.sort(sortedArr);

		HashMap<Integer, Integer> map=new HashMap<>();
		int rank=0;
		for(int i=0; i<n; i++){
			if(!map.containsKey(sortedArr[i])) {
				map.put(sortedArr[i], rank);
				rank++;
			}
		}

		for(int i=0; i<n; i++){
			bw.write(map.get(arr[i])+" ");
		}
		bw.flush();
		bw.close();
		br.close();

	}
}