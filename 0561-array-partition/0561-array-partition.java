class Solution {
    public int arrayPairSum(int[] nums) {
        int n=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            n=n+nums[i];
        }
        return n;
    }
}