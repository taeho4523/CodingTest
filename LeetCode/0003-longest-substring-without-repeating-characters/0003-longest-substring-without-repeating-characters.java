class Solution {
    public int lengthOfLongestSubstring(String s) {
        int prev=0;
        int index=0;
        int max=0;
        Set<Character> set = new HashSet<>();

        while(index<s.length()){
            char c = s.charAt(index);
            if(!set.contains(c)){
                set.add(c);
                index++;
                max=Math.max(max,set.size());
            }

            else{
                set.remove(s.charAt(prev));
                prev++;
            }
        }

        return max;

    }
}