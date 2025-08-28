import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       for(int i=0;i<n;i++){
           int a=Integer.parseInt(br.readLine());
           change(a);
       }

    }
    private static void change(int n){
        int a=n/25;
        n=n%25;
        int b=n/10;
        n=n%10;
        int c=n/5;
        n=n%5;
        int d=n/1;
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
