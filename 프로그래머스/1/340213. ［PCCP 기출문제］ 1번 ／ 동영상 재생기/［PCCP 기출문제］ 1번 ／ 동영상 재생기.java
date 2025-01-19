class Solution {
    private int timeConverter(String time){
        String[] splittime = time.split(":");
        return Integer.parseInt(splittime[0])*60+Integer.parseInt(splittime[1]);
    }

    private int skip(int time, int opSec, int opEndSec){
        if(opSec <= time && time<= opEndSec){
            time=opEndSec;
        }
        return time;
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        

        int videoSec = timeConverter(video_len);
        int posSec = timeConverter(pos);
        int opSec = timeConverter(op_start);
        int opEndSec = timeConverter(op_end);
        posSec = skip(posSec, opSec, opEndSec);

        for(String command : commands){
            if(command.equals("next"))
            {
                posSec +=10;
                if (posSec > videoSec){
                    posSec = videoSec;
                }
                posSec=skip(posSec, opSec, opEndSec);
            }
            if(command.equals("prev"))
            {
                posSec -= 10;
                if (posSec < 0) {
                    posSec = 0;
                }
                posSec = skip(posSec, opSec, opEndSec);
            }
        }
        String answer = String.format("%02d:%02d", posSec / 60, posSec % 60);
        return answer;
    }
}