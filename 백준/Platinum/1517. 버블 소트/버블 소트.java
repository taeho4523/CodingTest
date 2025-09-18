import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {
    static long count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,0,arr.length-1);

        bw.write(String.valueOf(count));
        bw.flush();

    }

    private static void mergeSort(int[] arr, int left, int right){
        if(left==right){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid, int right){
        int leftLength=mid-left+1;
        int rightLength=right-mid;
        int[] leftArr=new int[leftLength];
        int[] rightArr=new int[rightLength];
        for(int i=0; i<leftLength; i++){
            leftArr[i]=arr[left+i];
        }
        for(int j=0; j<rightLength; j++){
            rightArr[j]=arr[mid+1+j];
        }

        int i=0,j=0;
        int k=left;
        while(i<leftLength && j<rightLength){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            } else{
                arr[k]=rightArr[j];
                j++;
                count+=leftLength-i;
            } k++;
        }

        while(i<leftLength){
            arr[k]=leftArr[i];
            i++;
            k++;
        }

        while(j<rightLength){
            arr[k]=rightArr[j];
            j++;
            k++;
        }

    }
}
