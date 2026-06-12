class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalNumber = n * n;

        int checklist[] = new int[totalNumber + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currentNumber = grid[i][j];
                checklist[currentNumber]++;

            }
        }
        int repeated = -1;
        int missing = -1;
        for (int box = 1; box <= totalNumber; box++) {
            if (checklist[box] == 2) {
                repeated = box;
            } else if (checklist[box] == 0) {
                missing = box;
            }
        }
        return new int[] { repeated, missing };
    }
}