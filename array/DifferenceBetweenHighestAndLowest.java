class DifferenceBetweenHighestAndLowest {
    public int minimumDifference(int[] nums, int k) {
        int val = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>val){
                val = nums[i];
                
            }
        }

    }
}