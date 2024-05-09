package leetcode.qs1002;

import java.util.ArrayList;
import java.util.List;

public class qs1002 {
    public static void main(String[] args) {
        String[] str = {"cool","lock","cook"};
        System.out.println(String.join(",",commonChars(str)));
//        String.join(",",commonChars(str));
    }
    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        for (int j = 0; j < words[0].length(); j++) {
            String tempstr = String.valueOf(words[0].charAt(j));
            if (judge(tempstr,words) && judgecount(words,tempstr)) {
                result.add(tempstr);
            }
        }
        return result;
    }

    private static boolean judgecount(String[] words, String temp) {
        int count;
        count = countTempstr(temp,words,words[0]);
//        System.out.println(count);
        for (int i = 0; i < words.length; i++) {
            int k = countwordsi(temp,words[i]);
//            System.out.println(k);
            if (k != count) {
                return false;
            }
        }
        return true;
    }

    private static int countwordsi(String temp, String word) {
        int c = 0;
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equals(temp)) {
                c++;
            }
        }
        return c;
    }

    private static int countTempstr(String tempstr, String[] words, String word) {
        int count = 0;
        for (int i = 0; i < words[0].length(); i++) {
            if (String.valueOf(words[0].charAt(i)).equals(tempstr)) {
                count++;
            }
        }
        return count;
    }

    private static void remove_allTempstr(String tempstr, String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace(tempstr,"");
        }
    }

    private static boolean judge(String tempstr, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (!words[i].contains(tempstr)) {
                return false;
            }
        }
        return true;
    }
}
