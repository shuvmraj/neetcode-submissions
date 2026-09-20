class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int j=0;
        int[] newnums = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
               newnums[j]=nums[i];
               j++;
            }
        }
        for(int i = 0; i < j; i++) {
            nums[i] = newnums[i];
        }
         return j;
    }
}