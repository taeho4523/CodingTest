
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] dogam=new String[N+1];
		Map<String, Integer> map=new HashMap<>();

		for(int i=1; i<=N; i++){
			String name = br.readLine();
			dogam[i]=name;
			map.put(name,i);
		}

		for(int i=0; i<M; i++){
			String a=br.readLine();
			if(Character.isDigit(a.charAt(0))){
				int index=Integer.parseInt(a);
				bw.write(dogam[index]+"\n");
			} else {
				bw.write(map.get(a)+"\n");
			}
		}

		bw.flush();
	}
}
