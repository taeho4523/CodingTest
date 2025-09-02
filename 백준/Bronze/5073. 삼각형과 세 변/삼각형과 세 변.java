import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			int max=Math.max(a,b);
			max=Math.max(max,c);
			if(a==0 && b==0 && c==0) break;
			if(max>=a+b+c-max) {
				System.out.println("Invalid");
			}
			else if(a==b&&b==c)
				System.out.println("Equilateral");
			else if(a!=b&&b!=c&&a!=c)
				System.out.println("Scalene");
			else if(a==b||b==c||a==c)
				System.out.println("Isosceles");
		}
	}
}