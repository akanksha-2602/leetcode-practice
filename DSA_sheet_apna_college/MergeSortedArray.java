class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;         // Last card of Row 1
        int p2 = n - 1;         // Last card of Row 2
        int p = m + n - 1;      // Empty slot at the very back

        // While both rows still have cards left to compare
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1]; // Put Row 1's card at the back
                p1--;                 // Move Row 1's pointer backward
            } else {
                nums1[p] = nums2[p2]; // Put Row 2's card at the back
                p2--;                 // Move Row 2's pointer backward
            }
            p--;                      // Move the target slot backward
        }

        // If Row 1 runs out of cards early, just copy over whatever is left in Row 2
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}