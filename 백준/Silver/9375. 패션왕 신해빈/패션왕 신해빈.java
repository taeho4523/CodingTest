
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String,Integer> map = new HashMap();
		int n=Integer.parseInt(br.readLine());


		for(int i=0; i<n; i++){
			int clothes=Integer.parseInt(br.readLine());
			for(int j=0; j<clothes; j++){
				String category=br.readLine().split(" ")[1];
				if(map.containsKey(category)){
					map.put(category,map.get(category)+1);
				} else{
					map.put(category,1);
				}
			}
			int result=1;
			for(String key:map.keySet()){
				int value=map.get(key);
				result=(value+1)*result;
			}
			System.out.println(result-1);

			map.clear();
		}
	}

}