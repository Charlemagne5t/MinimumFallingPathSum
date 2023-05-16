package org.example;

import java.util.Arrays;

public class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        //base cases
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = matrix[0][j];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]) + matrix[i][j];
                } else if (j == matrix[i].length - 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + matrix[i][j];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i - 1][j + 1]) + matrix[i][j];
                }
            }
        }
        Arrays.sort(dp[matrix.length - 1]);
        return dp[dp.length - 1][0];
    }

}
