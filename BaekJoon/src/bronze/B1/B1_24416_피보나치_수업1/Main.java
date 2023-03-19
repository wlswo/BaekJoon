package BaekJoon.src.bronze.B1.B1_24416_피보나치_수업1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/24416
 * Problem: 피보나치 수업 1
 * Level: B1
 * Algorithm: dp 기초
 */
public class Main {
    static int cnt1 = 0;
    static int cnt2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        fibo1(n);
        fibo2(n);
        System.out.println(cnt1+" "+cnt2);
    }

    public static int fibo1(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        }

        else
            return fibo1(n - 1) + fibo1(n - 2);
    }

    public static int fibo2(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3; i<=n; i++,cnt2++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
