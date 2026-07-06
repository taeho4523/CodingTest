class Solution {
    public String convert(String s, int numRows) {
    if (numRows == 1) return s;
    
    StringBuilder sb = new StringBuilder();
    int cycle = 2 * numRows - 2;
    
    for (int row = 0; row < numRows; row++) {
        for (int j = row; j < s.length(); j += cycle) {
            sb.append(s.charAt(j));
    
            int mid = j + cycle - 2 * row;
            if (row != 0 && row != numRows-1 && mid < s.length()) {
                sb.append(s.charAt(mid));
            }
        }
    }
    return sb.toString();
}
}