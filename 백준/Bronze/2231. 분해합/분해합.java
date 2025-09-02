import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());
        int result=0;

        for(int i=1;i<a;i++){
            String b=String.valueOf(i);
            int sum=i;

            for(int j=0; j<b.length();j++){
                sum+=b.charAt(j)-'0';
            }
            if(sum==a){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }

}