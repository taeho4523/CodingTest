import java.io.*;
import java.util.*;

public class Main{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int one = 0;
        int zero = 0;
        char num = input.charAt(0);

        for(int i=1;i<input.length();i++){
            char temp = input.charAt(i);
            if(temp != num){
                num = temp;
                if(temp == '0')
                    one++;
                else
                    zero++;
            }
        }
        if(num == '1')
            one++;
        else
            zero++;

        System.out.println(Math.min(one,zero));
    }
}