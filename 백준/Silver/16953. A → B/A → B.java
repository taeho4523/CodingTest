import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int count=1;
        while(B>A){
            if(B%2==0){
                B=B/2;
                count++;
                if(B<A){
                    count=-1;
                    break;
                }
            } else if(B%10==1){
                B=(B-1)/10;
                count++;
                if(B<A){
                    count=-1;
                    break;
                }
            }
            else {
                count=-1;
                break;
            }
        }
        System.out.println(count);
    }
}