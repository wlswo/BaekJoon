package BaekJoon.src.silver.S2.S2_2075_N번째_큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


/**
 * BaekJoon
 * https://www.acmicpc.net/problem/2075
 * Problem: N번째 큰 수
 * Level: S2
 * Algorithm: 자료 구조, 우선순위 큐
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2-o1);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreElements()) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
        }

        while (N-- > 1) {
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}
