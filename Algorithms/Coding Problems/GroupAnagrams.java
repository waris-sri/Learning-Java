// LeetCode 49: Group Anagrams
// Time Complexity: O(n*m)

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] words) {
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (String word : words) {
            String anagramKey = getAnagramKey(word);
            anagramMap.computeIfAbsent(anagramKey, key -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    }

    private static String getAnagramKey(String word) {
        int[] count = new int[26];
        for (char letter : word.toCharArray()) {
            count[letter - 'a']++;
        }
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) { // exclude letters with 0 frequency from keys
                key.append(count[i]);
                key.append('a' + i); // ex. "better" = "1b2e2t1r" (as HashMap key)
            }
        }
        return key.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat", "tab", "ant", "ant", "one", "neo", "eon" };
        System.out.println(groupAnagrams(strs));
    }
}