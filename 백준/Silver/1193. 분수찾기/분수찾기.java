import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cross_block_count=1;
        int prev_count_sum=0;
        while(true){
            if(n<=prev_count_sum+cross_block_count){
                if(cross_block_count%2==1){
                    System.out.println(cross_block_count-(n-prev_count_sum-1)+"/"+(n-prev_count_sum));
                    break;
                } else {
                    System.out.print((n - prev_count_sum) + "/" + (cross_block_count - (n - prev_count_sum - 1)));
                    break;
                }
            }
            else {
                prev_count_sum+=cross_block_count;
                cross_block_count++;
            }
        }
    }
}