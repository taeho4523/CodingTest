import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] apart=new int[15][15];

        for(int i=0; i<15; i++){
            apart[0][i]=i;
            apart[i][1]=1;
        }

        for(int i=1; i<15; i++) {
            for(int j=2; j<15; j++){
                apart[i][j]=apart[i-1][j]+apart[i][j-1];
            }
        }

        int test=scanner.nextInt();

        for(int i=0; i<test; i++){
            int floor=scanner.nextInt();
            int detail=scanner.nextInt();
            System.out.println(apart[floor][detail]);
        }


    }

}