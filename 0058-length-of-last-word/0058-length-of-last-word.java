class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;  // i=length of string
        int count = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--; // skip spaces
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++; // count last word
            i--;
        }

        return count;
    }
}