//anagram easiest approach is sorting pr yaha qki list bnanana hai we'll have to see make a list as value in hashmap where key is sorted string and value its anagrams and there's everyhting the same
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if(!mp.containsKey(sorted)){
                mp.put(sorted,new ArrayList<>());
            }
            mp.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}
