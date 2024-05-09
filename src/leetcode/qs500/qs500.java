package leetcode.qs500;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class qs500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[20];
        int i  = 0;
        int leng = 0;
        while (sc.hasNextLine()) {
            String temp = sc.nextLine().toLowerCase(Locale.ROOT);
            if (temp.equals("")) {
                break;
            }
            str[i] = temp;
            i++;
            leng = i;
        }
//        System.out.println(strArrayClean(str).length);
        String[] t = strArrayClean(str);
        for (int j = 0; j < t.length; j++) {
            System.out.println(t[j]);
        }
    }

    private static String[] strArrayClean(String[] str) {
        List<String> listHub = new ArrayList<>();
        listHub.add("qwertyuiop");
        listHub.add("asdfghjkl");
        listHub.add("zxcvbnm");
        List<String> result = new ArrayList<>();
        for (int j = 0; j < str.length; j++) {
            if (str[j] != null && judge(str[j].toLowerCase(Locale.ROOT),listHub)) {
                result.add(str[j]);
            }
        }
        String[] tep = result.toArray(new String[result.size()]);
        return tep;
    }

    private static boolean judge(String s, List<String> listhub) {
        boolean flag = true;
        for (String str: listhub) {
            flag = true;
            for (int i = 0; i < s.length(); i++) {
                if (!str.contains(String.valueOf(s.charAt(i)))) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                return true;
            }
        }

        return flag ? true:false;
    }
}
