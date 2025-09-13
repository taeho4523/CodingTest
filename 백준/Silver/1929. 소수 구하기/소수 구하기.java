import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        boolean isPrime = true;

        if(N == 1) {
            N += 1;
        }
        else if (N == 0) {
            N += 2;
        }

        for(int i = N; i <= M; i++) {
            for(int j = 2; j*j <= i; j++) {
                if( i%j == 0 ) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                sb.append(i).append("\n");
            }
            isPrime = true;
        }

        System.out.println(sb);

    }
}
