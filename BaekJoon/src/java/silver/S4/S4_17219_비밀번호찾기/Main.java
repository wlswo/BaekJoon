package BaekJoon.src.java.silver.S4.S4_17219_비밀번호찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/17219
 * Problem: 비밀번호 찾기
 * Level: S4
 * Algorithm: 자료구조
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            map.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            String key = br.readLine();
            sb.append(map.get(key)).append("\n");
        }

        System.out.println(sb);
    }
}
