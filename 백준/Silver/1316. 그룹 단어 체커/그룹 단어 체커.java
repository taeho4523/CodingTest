import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int result=0;

        for(int i=0;i<a; i++){
            String word=sc.next();
            if(isGroupWord(word)){
                result++;
            }
        }
        System.out.println(result);
    }

    private static boolean isGroupWord(String word){
        Set<Character> seen=new HashSet<>();
        char prev=0;

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);

            if(c!=prev){
                if(seen.contains(c)){
                    return false;
                }
                seen.add(c);
            }
            prev=c;
        }

        return true;
        }
}
