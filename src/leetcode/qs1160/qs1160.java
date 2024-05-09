package leetcode.qs1160;

import java.util.ArrayList;
import java.util.List;

public class qs1160 {
    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        String str = "welldonehoneyr";
        System.out.println(countCharacters(words,str));
    }
    public static int countCharacters(String[] words, String chars) {
        int longestlength = 0;
        for (int i = 0; i < words.length; i++) {
            if(judge(words[i],chars)) {
                longestlength += words[i].length();
            }
        }
        return longestlength;
    }

    private static boolean judge(String s, String word) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!list.contains(temp)) {
                return false;
            } else {
                if (list.isEmpty()) {
                    return false;
                } else {
                    list.remove((Character)temp);
                }
            }
        }
        return true;
    }

//    private Map<Character, Integer> getcharsMap(String chars) {
//        Map<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i < chars.length(); i++) {
//            char tempch = chars.charAt(i)
//            if (!map.keySet().contains(tempch)) {
//                map.put(tempch,1);
//            } else {
//                int tempInt = map.get(tempch) + 1;
//                map.replace(tempch,tempInt);
//            }
//        }
//        return map;
//    }
}
