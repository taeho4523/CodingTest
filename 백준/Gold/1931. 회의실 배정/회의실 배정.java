import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt(); //회의 갯수 입력받기
        ArrayList<Time> t = new ArrayList<>();
        for(int i=0; i<N; i++){
            int start=n.nextInt();                //시작시간
            int end=n.nextInt();                  //종료시간 입력해주기
            t.add(new Time(start, end));
        }
        t.sort((o1, o2) -> {            //그냥t.sort로 종료시간으로만 정렬했더니 메모리초과 발생. 종료시간이 같으면 빠른시작시간을 우선정렬
            if (o1.end == o2.end) {
                return o1.start - o2.start; // 종료시간이 같으면 시작시간이 빠른 회의를 우선으로 선택
            } else {
                return o1.end - o2.end;
            }
        });
        Time Time;
        int endTime =0;
        int count =0;
        for(Time time : t) {
            if(time.start >= endTime) {
                endTime = time.end;
                count++;
            }
        }
        System.out.println(count);

    }
    static class Time {
        int start;
        int end;
        //메모리초과 해결해보려고 tostring 지워봄..

        public Time(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
}