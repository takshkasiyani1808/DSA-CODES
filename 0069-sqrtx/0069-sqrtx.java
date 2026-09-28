class Solution {
    public int mySqrt(int x) {
        int i = 0;

        while ((long) (i + 1) * (i + 1) <= x) {
            i++;
        }

        return i;
    }
}