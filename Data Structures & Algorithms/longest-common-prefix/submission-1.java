class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        //simple idea - pehle word ko pura prefix lelo or sbke sath compare kro agr match ni hua to word k letter ko hatao piche se since prefix hai and then check again and return prefix when it matches
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){ 
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}