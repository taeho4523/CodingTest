import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String[][] arr = new String[5][15];
        for(int i=0; i<5; i++){
            String a=br.readLine();
            for(int j=0; j<a.length(); j++){
                arr[i][j] = String.valueOf(a.charAt(j));
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<5; i++){
                if(arr[i][j]!=null)sb.append(arr[i][j]);
            }
        }
        System.out.println(sb);
    }
}
