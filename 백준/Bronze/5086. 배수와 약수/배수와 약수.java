import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
       while(true) {
           tokenizer= new StringTokenizer(br.readLine()," ");
           int a=Integer.parseInt(tokenizer.nextToken());
           int b=Integer.parseInt(tokenizer.nextToken());

           if(a==0&b==0) break;
           else if(b%a==0) System.out.println("factor");
           else if(a%b==0) System.out.println("multiple");
           else System.out.println("neither");
       }
    }
}
