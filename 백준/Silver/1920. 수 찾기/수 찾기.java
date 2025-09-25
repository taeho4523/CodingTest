import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> arr2=new HashSet<>();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr2.add(Integer.parseInt(st.nextToken()));
        }
        int M=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int a=Integer.parseInt(st.nextToken());
            if(arr2.contains(a)){
                System.out.println("1");
            }else
                System.out.println("0");
        }
    }
}
