import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long result=0L;
        for(int i=0; i<3; i++){
           Long a=sc.nextLong();
           result+=a;
        }
        System.out.println(result);

    }
}