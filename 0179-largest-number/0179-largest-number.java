class Solution {
    public String largestNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                String a = "" + nums[i] + nums[j];
                String b = "" + nums[j] + nums[i];

                if (b.compareTo(a) > 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        if (nums[0] == 0) {
            return "0";
        }

        String ans = "";

        for (int i = 0; i < nums.length; i++) {
            ans = ans + nums[i];
        }

        return ans;
    }
}