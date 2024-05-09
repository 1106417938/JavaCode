package leetcode.qs784;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class qs784 {
    public static void main(String[] args) {
        //"Ah71752"
        //["suggest","letter","of","husband","easy","education","drug","prevent","writer","old"]
        String template = "Ah71752";
        String[] strWords = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
        System.out.println(shortestCompletingWord(template,strWords));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character,Integer> map = getLetterMap(licensePlate);
        String result = getMinFullLetter(words,map);
        return result;
    }

    private static Map<Character, Integer> getLetterMap(String licensePlate) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            char ch = licensePlate.toLowerCase(Locale.ROOT).charAt(i);
            if (ch < 'a' || ch > 'z') {
                continue;
            }
            if (!map.keySet().contains(ch)) {
                map.put(ch,1);
            } else {
                map.replace(ch,map.get(ch),map.get(ch) + 1);
            }
        }
        return map;
    }

    private static String getMinFullLetter(String[] words, Map<Character, Integer> map) {
        int minleng = 16;
        String result = "";
        for (int i = 0; i < words.length; i++) {
            boolean flag = judge(words[i],map);
//            System.out.println(flag);
            if (flag) {
                if (words[i].length() < minleng) {
                    minleng = words[i].length();
                    result = words[i];
                }
            }
        }
        return result;
    }

    private static boolean judge(String word, Map<Character, Integer> map) {
        int count = 0;
        Map<Character,Integer> wordMap = getLetterMap(word);
        for (Map.Entry<Character,Integer> tempmap2: wordMap.entrySet()) {
            if (map.containsKey(tempmap2.getKey())) {
                count++;
                int letterNum = map.get(tempmap2.getKey());
                if (tempmap2.getValue() < letterNum) {
                    return false;
                }
            } else {
                continue;
            }
        }
        return count == map.entrySet().size() ? true:false;
    }
}
