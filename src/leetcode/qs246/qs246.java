package leetcode.qs246;

public class qs246 {
    public static void main(String[] args) {
        String num = "962";
        System.out.println(isStrobogrammatic(num));
    }
    public static boolean isStrobogrammatic(String num) {
        String trans = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                trans = "0" + trans;
            } else if (num.charAt(i) == '1') {
                trans = "1" + trans;
            }
            else if (num.charAt(i) == '6') {
                trans = "9" + trans;
            } else if (num.charAt(i) == '8') {
                trans = "8" + trans;
            } else if (num.charAt(i) == '9') {
                trans = "6" + trans;
            }
        }
        return num.equals(trans);
    }
}
