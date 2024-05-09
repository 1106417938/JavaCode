package leetcode.qs806;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class qs806 {
    public static void main(String[] args) {
        int[] width = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String str = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(width,str)));
    }
    public static int[] numberOfLines(int[] widths, String s) {
        Map<Character,Integer> map = new HashMap(){{
            put('a',widths[0]);
            put('b',widths[1]);
            put('c',widths[2]);
            put('d',widths[3]);
            put('e',widths[4]);
            put('f',widths[5]);
            put('g',widths[6]);
            put('h',widths[7]);
            put('i',widths[8]);
            put('j',widths[9]);
            put('k',widths[10]);
            put('l',widths[11]);
            put('m',widths[12]);
            put('n',widths[13]);
            put('o',widths[14]);
            put('p',widths[15]);
            put('q',widths[16]);
            put('r',widths[17]);
            put('s',widths[18]);
            put('t',widths[19]);
            put('u',widths[20]);
            put('v',widths[21]);
            put('w',widths[22]);
            put('x',widths[23]);
            put('y',widths[24]);
            put('z',widths[25]);
        }};
        int[] result = translateLine(map,s);
        return result;
    }

    private static int[] translateLine(Map<Character, Integer> map, String s) {
        int sum = 0;
        int lineSum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sum + map.get(s.charAt(i)) > 100) {
                lineSum ++;
                sum = 0;
                sum += map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        if (sum > 0) {
            lineSum ++;
        }
        return new int[]{lineSum, sum};
    }
}
