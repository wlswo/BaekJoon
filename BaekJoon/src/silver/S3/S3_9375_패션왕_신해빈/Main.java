package BaekJoon.src.silver.S3.S3_9375_패션왕_신해빈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/9375
 * Problem: 패션왕 신해빈
 * Level: S3
 * Algorithm: 조합론
 */
public class Main {
    static Map<String, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            map = new HashMap<>();

            for (int i = 0; i < num; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int answer = 1;
            for(int i : map.values()) {
                answer *= i + 1;
            }

            sb.append(answer-1).append("\n");
        }

        System.out.println(sb);

    }
}
