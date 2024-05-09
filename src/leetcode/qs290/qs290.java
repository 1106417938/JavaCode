package leetcode.qs290;

import java.util.HashMap;
import java.util.Map;

public class qs290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (!map.containsKey(str[i]) && !map.containsValue(String.valueOf(pattern.charAt(i)))) {
                map.put(str[i],String.valueOf(pattern.charAt(i)));
            }
        }
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result += map.get(str[i]);
        }
        System.out.println(result);
        return pattern.equals(result);
    }
}
