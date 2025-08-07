import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        String[] arr = b.split("");
        int plus = 0;
        int j=1;
        for(int i = 0; i < arr.length; i++){
            int temp= Integer.parseInt(arr[2-i]);
            System.out.println(a*temp);
            plus += a*temp*j;
            j=j*10;
        }
        System.out.println(plus);

    }
}