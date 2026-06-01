public class MaximumSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int currentwindow = 0;

        for (int i = 0; i < k; i++) {
            currentwindow = currentwindow + nums[i];
        }
            int maxwindow = currentwindow;

        for (int i = k; i < nums.length; i++) {
            currentwindow = currentwindow + nums[i] - nums[i-k];

            if(currentwindow > maxwindow){
                maxwindow = currentwindow;
            }
        }

        return (double)maxwindow/k;

    }
}
