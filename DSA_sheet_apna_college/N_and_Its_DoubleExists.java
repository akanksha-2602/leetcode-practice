class Solution {
    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int l = 0;
            int h = arr.length - 1;
            int target = arr[i] * 2;

            while (l <= h) {
                int mid = (l + h) / 2;
                if (arr[mid] < target) {
                    l = mid + 1;
                } else if (arr[mid] > target) {
                    h = mid - 1;
                } else {
                    if (mid != i) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
}