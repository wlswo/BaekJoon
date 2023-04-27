package BaekJoon.src.silver.S3.S3_11726_2xN타일링;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/11726
 * Problem: 2xN 타일링
 * Level: S3
 * Algorithm: 다이나믹 프로그래밍
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;
        dp[5] = 8;

        for (int i = 6; i <= n; i++) {
            dp[i] = ((dp[i - 1] % 10007) + (dp[i - 2] % 10007)) % 10007;
        }

        System.out.println(dp[n]);
    }
}
