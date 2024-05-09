package leetcode.qs1684;

import java.util.HashSet;
import java.util.Set;

public class qs1684 {
    public static void main(String[] args) {
        String str = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(str,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            if (judgeWord(allowed,words[i])) {
                result++;
            }
        }
        return result;
    }

    private static boolean judgeWord(String allowed, String word) {
        Set<String> set = getwordsSet(allowed);
        for (int i = 0; i < word.length(); i++) {
            if (!set.contains(String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    private static Set<String> getwordsSet(String allowed) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(String.valueOf(allowed.charAt(i)));
        }
        return set;
    }
}
