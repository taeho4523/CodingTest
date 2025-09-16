
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //듣못
		int M = Integer.parseInt(st.nextToken()); //보못

		Set<String> notListen=new HashSet<>();
		for(int i=0; i<N; i++){
			notListen.add(br.readLine());
		}
		List<String> result=new ArrayList<>();
		for(int i=0; i<M; i++){
			String name = br.readLine();
			if(notListen.contains(name)){
				result.add(name);
			}
		}
		Collections.sort(result);

		bw.write(String.valueOf(result.size())+"\n");
		for(int i=0; i<result.size(); i++){
			bw.write(result.get(i)+"\n");
		}
		bw.flush();
	}
}
