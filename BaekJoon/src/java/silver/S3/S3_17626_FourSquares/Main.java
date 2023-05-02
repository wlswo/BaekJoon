package BaekJoon.src.java.silver.S3.S3_17626_FourSquares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/17626
 * Problem: Four Squares
 * Level: S3
 * Algorithm: 다이나믹 프로그래밍
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i]= min + 1;
        }

        System.out.println(dp[n]);
    }
}
