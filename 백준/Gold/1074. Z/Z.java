import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int count=0;
        int size=(int)Math.pow(2,n);
        while(size>1) {
            size/=2;
            if (r < size && c < size){
            }
            else if(r<size&&c>=size){
                count+=size*size;
                c-=size;
            } else if(r>=size&&c<size){
                count+=(2*size*size);
                r-=size;
            }else {
                count+=(3*size*size);
                r-=size;
                c-=size;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();

    }
}
