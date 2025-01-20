class Solution {
    public int[] solution(long n) {
        String number=String.valueOf(n);
        int[] answer=new int[number.length()];
        String[] arraynumber=number.split("");
        for(int i=0; i<number.length(); i++){
            answer[i]=Integer.parseInt(arraynumber[number.length()-i-1]);
        }
        return answer;
    }
}