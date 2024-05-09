package leetcode.qs929;

import java.util.HashSet;
import java.util.Set;

public class qs929 {
    public static void main(String[] args) {
        String[] str = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(str));
    }
    public static int numUniqueEmails(String[] emails) {
        // 1.split str :
        // 2.delete "." :
        // 3.截取从头开始到第一个“+”的的字符串 :
        Set<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String localStr = emails[i].split("@")[0];
            String domainStr = emails[i].split("@")[1];
            localStr = deleteadd(localStr);
            localStr = deletejuhao(localStr);
            String cleanEmail = localStr +"@" + domainStr;
            if (!set.contains(cleanEmail)) {
                set.add(cleanEmail);
            }
        }
        return set.size();
    }

    private static String deletejuhao(String localStr) {
        String result = "";
//        System.out.println(localStr);
        result = localStr.replaceAll("\\.","");
//        System.out.println(result);
        return result;
    }

    private static String deleteadd(String localStr) {
        String result = "";
        int addOperateIndex = localStr.indexOf("+");
        if (addOperateIndex != -1) {
            result = localStr.substring(0,addOperateIndex);
        } else {
            result = localStr;
        }

        return result;
    }
}
