
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> arr = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String method=st.nextToken();
			switch(method) {
				case "add":
					int a=Integer.parseInt(st.nextToken());
					if(!arr.contains(a)){
						arr.add(a);
						break;
					} else break;
				case "remove":
					int b=Integer.parseInt(st.nextToken());
					if(arr.contains(b)){
						arr.remove(Integer.valueOf(b));
						break;
					} else break;
				case "check":
					int c=Integer.parseInt(st.nextToken());
					if(arr.contains(c)){
						bw.write("1\n");
						break;
					} else {
						bw.write("0\n");
						break;
					}
				case "toggle":
					int d=Integer.parseInt(st.nextToken());
					if(arr.contains(d)){
						arr.remove(Integer.valueOf(d));
						break;
					} else {
						arr.add(d);
						break;
					}
				case "all":
					arr.clear();
					for(int j=1; j<=20; j++){
						arr.add(j);
					}
					break;
				case "empty":
					arr.clear();
					break;
			}
		}
		bw.flush();

	}
}