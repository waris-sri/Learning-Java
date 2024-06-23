import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> freqMap = new HashMap<>();

        for (String word : strs) {
            String charFreq = getCharFreq(word);
            if (freqMap.containsKey(charFreq)) {
                freqMap.get(charFreq).add(word);
            } else {
                List<String> wordList = new ArrayList<>();
                wordList.add(word);
                freqMap.put(charFreq, wordList);
            }
        }

        return new ArrayList<>(freqMap.values());
    }

    public static String getCharFreq(String word) {
        int[] count = new int[26];

        for (char letter : word.toCharArray()) {
            count[letter - 'a']++;
        }

        StringBuilder charFreq = new StringBuilder("");
        char charList = 'a'; // start from 'a' disregarding what letters there are
        for (int charIndexInWord : count) {
            charFreq.append(charIndexInWord);
            charFreq.append(charList); // ex. "better" = "1b2e2t1r" (as HashMap key)
            charIndexInWord++;
        }
        
        return charFreq.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}