class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                n+=nums[i];
            }
            else{
                m+=nums[i];
            }
        }
        return n!=m;
    }
}