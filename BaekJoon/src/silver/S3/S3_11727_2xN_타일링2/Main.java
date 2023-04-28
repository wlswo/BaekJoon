package BaekJoon.src.silver.S3.S3_11727_2xN_타일링2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/11727
 * Problem: 2xN 타일링2
 * Level: S3
 * Algorithm: 다이나믹 프로그래밍
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1) {
            System.out.println(1);
            System.exit(0);
        }
        long[] dp = new long[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] % 10007 + (dp[i - 2]*2) % 10007) % 10007;
        }

        System.out.println(dp[n]);
    }
}
