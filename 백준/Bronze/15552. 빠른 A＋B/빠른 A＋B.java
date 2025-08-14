import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test=Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            String s = br.readLine();
            int a=Integer.parseInt(s.split(" ")[0]);
            int b=Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
        bw.close();
    }
}