class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                flag = true;
            }
            set.add(nums[i]);
            
        }
        return flag;
    }
}