class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i]; //question me hi diya hua hai and if u see it fits here with the easiest approach
        }
        
        return arr;
    }
}