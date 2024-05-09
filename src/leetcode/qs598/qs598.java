package leetcode.qs598;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class qs598 {
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int count = m * n;
        for (int i = 0; i < ops.length; i++) {
            int temp = ops[i][0] * ops[i][1];
            if (temp < count) {
                count = temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2,2},{3,3}};
        System.out.println(maxCount(m,n,ops));
    }
}
