package BaekJoon.src.java.silver.S3.S3_1463_1로_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/1463
 * Problem: 1로 만들기
 * Level: S3
 * Algorithm: 다이나믹 프로그래밍
 */
public class Main {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recul(n));
    }

    static public int recul(int x) {
        if (dp[x] == null) {
            if (x % 6 == 0) {
                dp[x] = Math.min(recul(x - 1), Math.min(recul(x / 3), recul(x / 2))) + 1;
            } else if (x % 3 == 0) {
                dp[x] = Math.min(recul(x / 3), recul(x - 1)) + 1;
            } else if (x % 2 == 0) {
                dp[x] = Math.min(recul(x / 2), recul(x - 1)) + 1;
            } else {
                dp[x] = recul(x - 1) + 1;
            }
        }
        return dp[x];
    }
}