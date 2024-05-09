package leetcode.qs266;

public class qs266 {
    public static void main(String[] args) {
        String str = "carerac";
        System.out.println(canPermutePalindrome(str));
    }
    public static boolean canPermutePalindrome(String s) {
        int[] wordCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            wordCount[s.charAt(i) - 'a'] += 1;
        }
        int notPairs = 0;
        for (int i = 0; i < wordCount.length; i++) {
            if (wordCount[i] % 2 != 0) {
                notPairs++;
            }
        }
        if (notPairs == 0 || notPairs == 1) {
            return true;
        } else {
            return false;
        }
    }
}
