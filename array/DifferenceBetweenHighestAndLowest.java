import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1)
            return 0;

        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;

        for (int i = k - 1; i < nums.length; i++) {
            int currentdiff = nums[i] - nums[i - k + 1];
            mindiff = Math.min(mindiff, currentdiff);

        }
        return mindiff;
    }
}