package leetcode.qs944;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class qs944 {
    public static void main(String[] args) {
        String[] str = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(str));
    }
    public static int minDeletionSize(String[] strs) {
        int count = 0;
        String temp = "";
        for (int i = 0; i < strs[0].length(); i++) {
            temp = "";
            for (int j = 0; j < strs.length; j++) {
                temp += strs[j].charAt(i);
            }
            if (!judge(temp)) {
                count++;
            }
        }
        return count;
    }

    private static boolean judge(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(String.valueOf(str.charAt(i)));
        }
        list.sort(Comparator.naturalOrder());
        String strtemp = String.join("",list);
        return strtemp.equals(str) ? true : false;
    }
}
