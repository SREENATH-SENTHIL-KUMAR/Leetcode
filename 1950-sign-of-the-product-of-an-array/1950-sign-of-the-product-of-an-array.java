class Solution {
    public int arraySign(int[] nums) {
       int n=1;
       for(int i=0;i<nums.length;i++){
          if (nums[i] == 0) {
                return 0; 
            } 
			if (nums[i] < 0) {
                n = -n; 
            }
        }
        return n; 
    }
}