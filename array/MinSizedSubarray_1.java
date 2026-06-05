public class MinSizedSubarray_1 {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int left = 0;
        int minlength = Integer.MAX_VALUE;

        for(int i = 0; i< nums.length;i++){
            currentSum += nums[left];

            while(currentSum > target){
                left = i - left + 1;
                minlength = Math.min(currentSum, minlength);
                left++;
            }
        }
        return minlength;

    }
}
