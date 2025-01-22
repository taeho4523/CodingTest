class Solution {
    public String solution(String s) {
        String lowers = s.toLowerCase(); 
        String[] splits = lowers.split(" ", -1);
        StringBuilder answer = new StringBuilder(); 

        for (int i = 0; i < splits.length; i++) {
            if (splits[i].length() > 0) { 
                String[] character = splits[i].split(""); 
                character[0] = character[0].toUpperCase(); 
                String word = String.join("", character);
                answer.append(word); 
            }
            
            if (i != splits.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}
