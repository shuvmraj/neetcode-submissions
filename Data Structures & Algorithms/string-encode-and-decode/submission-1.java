//upon thinking and searching , encoding can be done anyway , like adding numbers or symbols between the actual string , the main logic will be on decoding , so encode keeping in mind that you can decode it 
//in decoding just u remove the impure character , symbols u inserted and find a login 
class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));

            j++;

            list.add(str.substring(j, j + len));

            i = j + len;
        }

        return list;
    }
}