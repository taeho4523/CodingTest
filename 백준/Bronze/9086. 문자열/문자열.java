import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int s=Integer.parseInt(br.readLine());
       for(int i=0;i<s;i++){
           String a=br.readLine();
           bw.write(a.charAt(0)+""+a.charAt(a.length()-1));
           bw.newLine();
       }
       bw.flush();
       br.close();
       bw.close();
    }
}