package leetcode.qs942;

import java.util.Arrays;

public class qs942 {
    public static void main(String[] args) {
        String str = "IDID";
        System.out.println(Arrays.toString(diStringMatch(str)));
    }
    public static int[] diStringMatch(String s) {
//        String sInt = create(s.length() + 1);
//        int[] result = new int[sInt.length()];
        //全排列
//        search(0,sInt.length() - 1,sInt,s,result);
        //贪心法
        int n = s.length(), lo = 0, hi = n;
        int[] perm = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            perm[i] = s.charAt(i) == 'I' ? lo++ : hi--;
        }
        perm[n] = lo; // 最后剩下一个数，此时 lo == hi
        return perm;
    }

//    private static void search(int start, int end, String sInt, String s, int[] result) {
//        if (start == end) {
//            boolean flag = judge(sInt,s);
//            if (flag) {
//                for (int k = 0; k <sInt.length(); k++) {
//                    result[k] = Integer.parseInt(String.valueOf(sInt.charAt(k)));
//                }
//            }
//        }
//        for (int i = start; i <= end; i++) {
//            sInt = perm(sInt,start,i);
//            search(start + 1,end,sInt,s,result);
//
//            sInt = perm(sInt,start,i);
////          System.out.println(sInt);
//        }
//    }
//
//    private static boolean judge(String sInt, String s) {
//        boolean flag = true;
//            for (int j = 0; j < s.length(); j++) {
//                if (s.charAt(j) == 'I') {
//                    if (sInt.charAt(j) > sInt.charAt(j + 1)) {
//                        flag = false;
//                        return flag;
//                    }
//                }
//                if (s.charAt(j) == 'D') {
//                    if (sInt.charAt(j) < sInt.charAt(j + 1)) {
//                        flag = false;
//                        return flag;
//                    }
//                }
//            }
//        return flag;
//    }
//
//    private static String perm(String sInt, int i, int j) {
//        char tempi;
//        char tempj;
//        char temp = 'a';
//        tempi = sInt.charAt(i);
//        tempj = sInt.charAt(j);
//        for (int k = 0; k < sInt.length(); k++) {
//            if (k == i) {
//                sInt = sInt.replace(tempj,temp);
//                sInt = sInt.replace(tempi,tempj);
//                sInt = sInt.replace(temp,tempi);
//            }
//        }
//        return sInt;
//    }
//
//    private static String create(int leng) {
//        String result = "";
//        for (int i = 0; i < leng; i++) {
//            result += i;
//        }
//        return result;
//    }
}
