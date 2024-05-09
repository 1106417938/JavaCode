package leetcode.qs1598;

import java.util.HashMap;
import java.util.Map;

public class qs1598 {
    public static void main(String[] args) {
        String[] logs = {"d1/","../","../","../"};
        System.out.println(minOperations(logs));
    }
    public static int minOperations(String[] logs) {
        int result = 0;
        Map<String,Integer> map = new HashMap(){{
            put("../",-1);
            put("./",0);
            put("/",1);
        }};
        for (int i = 0; i < logs.length; i++) {
            String temp = cleanstr(logs[i]);
            if (result == 0 && map.get(temp) == -1) {
                result = 0;
            }
            else if (map.get(temp) == 0) {
                result = result + 0;
            }
            else if (map.get(temp) == -1 && result != 0) {
                result += -1;
            }
            else {
                result += 1;
            }
        }
        return result;
    }

    private static String cleanstr(String log) {
        String result = "";
        for (int i = 0; i < log.length(); i++) {
            if (log.charAt(i) == '.' || log.charAt(i) =='/') {
                result += log.charAt(i);
            }
        }
        return result;
    }
}
