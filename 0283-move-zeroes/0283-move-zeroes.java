class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int idx = 0;

        // copy non-zero elements compactly
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[idx++] = nums[i];
            }
        }

        // fill the rest with zeros
        while (idx < n) {
            temp[idx++] = 0;
        }

        // copy back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
