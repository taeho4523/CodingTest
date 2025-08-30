import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int result=0;
        for(int i=a;i<=b;i++){
            if(sosu(i)==true){
            arr.add(i);
            result+=i;
            }
        }
        if(arr.size()==0){
            System.out.println(-1);
        } else {
            System.out.println(result);
            System.out.println(arr.get(0));
        }
    }

    private static boolean sosu(int n){
        if(n==0||n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}