package BaekJoon.src.java.silver.S2.S2_11279_최대힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/11279
 * Problem: 최대 힙
 * Level: S2
 * Algorithm: 우선순위 큐
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        while (num-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                sb.append(queue.peek() == null ? 0 : queue.poll()).append("\n");
            }else {
                queue.add(n);
            }
        }

        System.out.println(sb);
    }
}
