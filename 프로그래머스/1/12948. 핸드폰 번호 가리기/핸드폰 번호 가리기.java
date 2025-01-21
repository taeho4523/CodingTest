class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String[] number = phone_number.split("");
        for(int i=0; i<len-4; i++){
            number[i]="*";
        }
        String answer=String.join("",number);
        return answer;
    }
}