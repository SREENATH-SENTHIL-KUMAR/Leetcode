class Solution {
    public int removeDuplicates(int[] nums) {
        int s=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[s-2]){
                nums[s]=nums[i];
                s++;
            }
        }   
        return s;
    }
}