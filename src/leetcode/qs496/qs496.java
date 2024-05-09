package leetcode.qs496;

import java.util.Arrays;

public class qs496 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int result = -1;
            int pos = getPos(nums1[i],nums2);
            while (pos < nums2.length) {
                if (nums2[pos] > nums1[i]) {
                    result = nums2[pos];
                    break;
                } else {
                    pos++;
                }
            }
            res[i] = result;
        }
        return res;
    }

    private static int getPos(int num1_i, int[] nums2) {
        for (int i = 0; i <nums2.length; i++) {
            if (nums2[i] == num1_i){
                return i;
            }
        }
        return 0;
    }
}
