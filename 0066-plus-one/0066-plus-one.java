class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++; // add 1 when last digit is not 0
                return digits;
            }

            digits[i] = 0; // 9 becomes 0
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1; // all digits were 9

        return ans;
    }
}