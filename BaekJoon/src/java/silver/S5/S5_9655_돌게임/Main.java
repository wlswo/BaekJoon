package BaekJoon.src.java.silver.S5.S5_9655_돌게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Programmers
 * https://www.acmicpc.net/problem/9655
 * Problem: 돌 게임
 * Level: S5
 * Algorithm: DP
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;

        for(int i=4; i<=N; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-3]) + 1;
        }

        System.out.println(dp[N]%2 == 1 ? "SK" : "CY");
    }
}

/**
 * 돌은 무조건 1개나 3개만 가져갈 수 있으므로,
 * 현재 돌의 개수에 대한 게임 과정의 횟수를 DP[N] 이라고 두자
 *
 * DP[N] = Math.min( (DP[N - 1] + 1의 경우) OR (DP[N - 3] + 1의 경우) )
 * 💡여기서 Math.min 을 사용하는 이유는 게임을 완벽하게(최소한의 게임 과정 회수)를 의미하므로 사용한다.
 *
 */