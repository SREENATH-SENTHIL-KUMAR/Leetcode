class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    n^=nums[i];
                }
            }
        }
        return n;   
    }
}