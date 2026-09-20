//very easy using hashmap and also optimised just check the required value in the map , other wise fill the map  
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int req = target-nums[i];
            if(mp.containsKey(req)){
                return new int[]{mp.get(req),i};
            }
            mp.put(nums[i],i);

        }
        return new int[]{};

    }
}
