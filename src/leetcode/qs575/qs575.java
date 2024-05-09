package leetcode.qs575;

import java.util.Arrays;

public class qs575 {
    public static void main(String[] args) {
        int[] candy = {6,6,6,6};
        System.out.println(distributeCandies(candy));
    }
    public static int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int countCandy = 1;
        int currentCandy = 100001;
        int preCandy = candyType[0];
        for (int i = 1; i < candyType.length; i++) {
            currentCandy = candyType[i];
            if (countCandy >= candyType.length / 2) {
                break;
            }
            else if (preCandy != currentCandy) {
                countCandy ++;
                preCandy = currentCandy;
            }
        }
        return countCandy;
    }
}
