package BaekJoon.src.java.silver.S2.S2_22233_가희와_키워드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/22233
 * Problem: 가히와 키워드
 * Level: S2
 * Algorithm: 해시셋, 자료구조
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        while (n-- > 0) {
            set.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            String[] words = br.readLine().split(",");
            for (String s : words) {
                set.remove(s);
            }
            sb.append(set.size()).append("\n");
        }

        System.out.println(sb);
    }
}
