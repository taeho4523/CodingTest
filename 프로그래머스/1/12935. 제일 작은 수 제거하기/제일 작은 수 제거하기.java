class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        if(arr.length == 1) {
            answer = new int[]{-1};
        }
        else {
            answer = new int[arr.length - 1];
            int j = 0;
            for(int i = 0; i < arr.length - 1; i++) {
                if(j == minIndex) {
                    j++;
                }
                answer[i] = arr[j++];
            }
        }
        return answer;
    }
}