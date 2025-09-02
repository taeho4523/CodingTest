

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());

		if(n<=1){
			System.out.println(0);
			return;
		}
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int firstX=Integer.parseInt(st.nextToken());
		int firstY=Integer.parseInt(st.nextToken());

		int x_min=firstX;
		int x_max=firstX;
		int y_min=firstY;
		int y_max=firstY;

		for(int i=1; i<n; i++){
			st=new StringTokenizer(br.readLine()," ");
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());

			x_min=Math.min(x_min,x);
			x_max=Math.max(x_max,x);
			y_min=Math.min(y_min,y);
			y_max=Math.max(y_max,y);
		}
		System.out.println((x_max-x_min)*(y_max-y_min));
	}
}