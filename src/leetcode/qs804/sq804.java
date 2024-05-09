package leetcode.qs804;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sq804 {
    public static void main(String[] args) {
        String str[] = {"a"};
        System.out.println(uniqueMorseRepresentations(str));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        Map<Character,String> map = new HashMap(){{
            put('a',".-");
            put('b',"-...");
            put('c',"-.-.");
            put('d',"-..");
            put('e',".");
            put('f',"..-.");
            put('g',"--.");
            put('h',"....");
            put('i',"..");
            put('j',".---");
            put('k',"-.-");
            put('l',".-..");
            put('m',"--");
            put('n',"-.");
            put('o',"---");
            put('p',".--.");
            put('q',"--.-");
            put('r',".-.");
            put('s',"...");
            put('t',"-");
            put('u',"..-");
            put('v',"...-");
            put('w',".--");
            put('x',"-..-");
            put('y',"-.--");
            put('z',"--..");
        }};
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String temp = traslate(words[i],map);
            wordSet.add(temp);
        }
        return wordSet.size();
    }

    private static String traslate(String word, Map<Character, String> map) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += map.get(word.charAt(i));
        }
        return result;
    }
}
