package BaekJoon.src.java.silver.S3.S3_13305_주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/13305
 * Problem: 주유소
 * Level: S3
 * Algorithm: 구현
 */
public class Main {
    static long[] distances; //거리
    static long[] prices;    //리터당 가격

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        distances = new long[N - 1];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }

        prices = new long[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 0;

        long minPrice = prices[0];
        for (int i = 0; i < N - 1; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            answer += (distances[i] * minPrice);
        }

        System.out.println(answer);
    }
}
