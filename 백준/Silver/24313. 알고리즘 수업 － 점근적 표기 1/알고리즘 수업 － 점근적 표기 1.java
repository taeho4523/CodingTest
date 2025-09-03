import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a_1=Integer.parseInt(st.nextToken());
		int a_0=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(br.readLine());
		int n_0=Integer.parseInt(br.readLine());
		boolean result=true;
		for(int i=n_0; i<=100; i++){
			if(a_1*i+a_0>c*i){
				result=false;
				break;
			}
		}
		if(result){
			System.out.println(1);
		} else
			System.out.println(0);


	}
}