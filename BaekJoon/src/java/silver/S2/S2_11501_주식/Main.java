package BaekJoon.src.java.silver.S2.S2_11501_주식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/11501
 * Problem: 주식
 * Level: S2
 * Algorithm: 그리디 알고리즘
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int[] days = new int[Integer.parseInt(br.readLine())];
            String[] str = br.readLine().split(" ");
            for (int i = 0; i < days.length; i++) {
                days[i] = Integer.parseInt(str[i]);
            }

            long benefit = 0 ;
            int max = Integer.MIN_VALUE;

            for (int i = days.length - 1; i >= 0; i--) {
                if(days[i] > max)
                    max = days[i];
                else {
                    benefit += max-days[i];
                }
            }

            sb.append(benefit).append("\n");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb);
    }
}
