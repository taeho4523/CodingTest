import java.util.*;
public class Main {
    public static void main(String[] args) {
        int shirtanswer=0;
        Scanner scanner = new Scanner(System.in);

        int people = scanner.nextInt();
        int[] sizeArr = new int[6];

        for(int i=0; i<6; i++){
            sizeArr[i] = scanner.nextInt();
        }
        int t= scanner.nextInt();
        int p= scanner.nextInt();

        for(int i=0; i<6; i++){
            shirtanswer+=tshirt(t, sizeArr[i]);
        }
        System.out.println(shirtanswer);

        System.out.println(people/p + " " + people%p);
    }




    private static int tshirt(int t, int a){
        int temp=1;
        while(true){
            if(a==0){
                temp=0;
                break;
            }
            else if(t*temp<a){
                temp++;
            }
            else if(t*temp>=a)
                break;
        }
        return temp;
    }
}