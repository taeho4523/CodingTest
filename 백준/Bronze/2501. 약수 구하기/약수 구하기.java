import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer tokenizer= new StringTokenizer(br.readLine()," ");
       int a = Integer.parseInt(tokenizer.nextToken());
       int b = Integer.parseInt(tokenizer.nextToken());
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i=1;i<=a;i++){
           if(a%i==0){
               arr.add(i);
           }
       }
        if(b <= arr.size()){ 
            System.out.println(arr.get(b-1));
        } else {
            System.out.println(0);
        }

    }
}
