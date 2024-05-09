package leetcode.qs243;

public class qs243 {
    public static void main(String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String str1 = "makes";
        String str2 = "coding";
        System.out.println(shortestDistance(words,str1,str2));
    }
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int word1Pos = -1;
        int words2Pos = -1;
        int minDis = 30000;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                word1Pos = i;
            } else if (wordsDict[i].equals(word2)) {
                words2Pos = i;
            }
            if ((word1Pos != -1 && words2Pos != -1) && Math.abs(word1Pos - words2Pos) < minDis) {
                minDis = Math.abs(word1Pos - words2Pos);
            }
        }
        return minDis;
    }
}
