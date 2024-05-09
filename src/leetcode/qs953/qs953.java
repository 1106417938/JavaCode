package leetcode.qs953;

public class qs953 {
    public static void main(String[] args) {
        String[] str = {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlienSorted(str,order));
    }
    public static boolean isAlienSorted(String[] words, String order) {
        if (words.length == 1) {
            return true;
        }
        for (int i = 1; i < words.length; i++) {
            if(!judge(words,i-1,i,order)) {
                return false;
            }
        }
        return true;
    }

    private static boolean judge(String[] words, int m, int n, String order) {
        int mLength =  words[m].length();
        int nLength = words[n].length();
        int leng = mLength > nLength ? nLength : mLength;
        for (int i = 0; i < leng; i++) {
//            System.out.println(order.indexOf(String.valueOf(words[m].charAt(i))));
            if (order.indexOf(String.valueOf(words[m].charAt(i))) < order.indexOf(String.valueOf(words[n].charAt(i)))) {
                return true;
            }
            else if (order.indexOf(String.valueOf(words[m].charAt(i))) == order.indexOf(String.valueOf(words[n].charAt(i)))) {
                continue;
            } else {
                return false;
            }
        }
        if (mLength > nLength) {
            return false;
        }
        return true;
    }
}
