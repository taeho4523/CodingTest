import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());

        for(int i=2; i<=Math.sqrt(a); i++){
            while(a%i==0){
                System.out.println(i);
                a=a/i;
            }
        }
        if(a!=1){
            System.out.println(a);
        }
    }
}