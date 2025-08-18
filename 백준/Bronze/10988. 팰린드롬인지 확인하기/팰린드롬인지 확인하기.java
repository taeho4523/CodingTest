import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s=br.readLine();
        boolean isTrue=true;

        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                isTrue=false;
                break;
            }
        }
        if(isTrue){
            bw.write("1");
        } else bw.write("0");

        bw.flush();
        bw.close();
        br.close();
    }
}