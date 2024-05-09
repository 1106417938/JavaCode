package leetcode.qs821;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sq821 {
    public static void main(String[] args) {
        String str = "loveleetcode";
        char ch = 'e';
        System.out.println(Arrays.toString(shortestToChar(str,ch)));
    }
    public static int[] shortestToChar(String s, char c) {
        int[] chPosition = findChPosition(s,c);
        int[] result = getChsMinDistance(s,c,chPosition);
        return result;
    }

    private static int[] getChsMinDistance(String s, char c, int[] chPosition) {
        int[] result = new int[s.length()];
        int minDistance = 0;
        for (int i = 0; i < s.length(); i++) {
            minDistance = 10001;
            for (int j = 0; j < chPosition.length; j++) {
                if (Math.abs(i - chPosition[j]) <= minDistance) {
                    minDistance = Math.abs(i - chPosition[j]);
                }
            }
            result[i] = minDistance;
        }
        return result;
    }

    private static int[] findChPosition(String s, char c) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (Integer in:list) {
            result[i] = in;
            i++;
        }
        return result;
    }
}
