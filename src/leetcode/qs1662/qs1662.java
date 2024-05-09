package leetcode.qs1662;

public class qs1662 {
    public static void main(String[] args) {
        String[] word1 = {};
        String[] word2 = {};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1 = "";
        String temp2 = "";
        for (int i = 0; i < word1.length; i++) {
            temp1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            temp2 += word2[i];
        }
        return temp1.equals(temp2);
    }
}
