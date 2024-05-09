package leetcode.qs1528;

import java.util.Arrays;

public class qs1528 {
    public static void main(String[] args) {
        String words = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(words,indices));
    }
    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[indices[i]] = s.charAt(i);
        }
        String result = String.valueOf(chars);
        return result;
    }
}
