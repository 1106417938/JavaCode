package leetcode.qs566;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class qs566 {
    public static void main(String[] args) {
        int[][] metris = {{1,2},{3,4}};
        int row = 1;
        int col = 4;
        System.out.println(Arrays.toString(matrixReshape(metris,row,col)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int matR = mat.length;
        int matC = mat[0].length;
        if (matR * matC != r * c) {
            return mat;
        } else {
            int[][] newMat = new int[r][c];
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < matR; i++) {
                for (int j = 0; j < matC; j++) {
                    list.add(mat[i][j]);
                }
            }
            int k = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    newMat[i][j] = list.get(k);
                    k++;
                }
            }
            return newMat;
        }
    }
}
