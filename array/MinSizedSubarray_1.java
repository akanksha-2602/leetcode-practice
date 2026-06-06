public class MinSizedSubarray_1 {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int left = 0;
        int minlength = Integer.MAX_VALUE;

        for(int right = 0; right< nums.length;right++){
            currentSum += nums[left];

            while(currentSum >= target){
                int currentWindowSize = right - left + 1;
                minlength = Math.min(currentWindowSize, minlength);
                currentSum -= nums[left];
                left++;
            }
        }
        return minlength == Integer.MAX_VALUE:0? minlength;

    }
}

// int arr[] = [1,2,3,4,5,6];
// target = 6
// left = 0
// for loop -> right = 0 and so on till, [1,2,3] ,currentSum = 6
//then while loop will check if currentSum >= target 
// int currentWindowSize  = right- left +1; 
//Math.min(currentWindowSize, minlength);
//currentSum -= nums[left];
//left++
// return minlength == Integer.MAX_VALUE : 0? minlength;