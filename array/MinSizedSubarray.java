public class MinSizedSubarray {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int left = 0;
        int minlength = Integer.MAX_VALUE;

        // Using 'right' instead of 'i' keeps the boundaries crystal clear
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right]; 

            while (currentSum >= target) {
                // 1. Calculate the window size using right and left
                int currentWindowSize = right - left + 1;
                
                // 2. Update your minlength tracker
                minlength = Math.min(minlength, currentWindowSize);

                // 3. Shrink the sum by removing the element at the left index
                currentSum -= nums[left];
                
                // 4. Move the left index forward by 1 step smoothly
                left++;
            }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
}
