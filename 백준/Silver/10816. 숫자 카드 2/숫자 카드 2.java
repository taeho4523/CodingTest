
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr_n = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr_n[i]=Integer.parseInt(st.nextToken());
		}

		Map<Integer, Integer> map= new HashMap<>();
		for(int i=0; i<n; i++){
			map.put(arr_n[i],map.getOrDefault(arr_n[i],0)+1);
		}
		int m=Integer.parseInt(br.readLine());
		int[] arr_m = new int[m];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++){
			arr_m[i]=Integer.parseInt(st.nextToken());
		}
		int count=0;
		for(int i=0; i<m; i++){
			bw.write(map.getOrDefault(arr_m[i],0)+" ");
		}
		bw.flush();
	}
}