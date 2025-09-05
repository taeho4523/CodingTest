import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        ArrayList<Long> arr=new ArrayList<>();
        for(int i=0; i<String.valueOf(n).length(); i++){
            char ch=String.valueOf(n).charAt(i);
            arr.add(Long.parseLong(String.valueOf(ch)));
        }
        arr.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.size(); i++){
            sb.append(arr.get(i));
        }
        System.out.println(sb.toString());
    }
}