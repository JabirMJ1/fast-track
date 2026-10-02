import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sorted = new HashMap<>();
        for(int i =0; i<strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);
            if(!sorted.containsKey(newString)){
                sorted.put(newString, new ArrayList<>());
            }
            sorted.get(newString).add(strs[i]);
        }
        return new ArrayList<>(sorted.values());
    }
}