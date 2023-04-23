package BaekJoon.src.silver.S1.S1_1697_숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/1697
 * Problem: 숨바꼭질
 * Level: S1
 * Algorithm: BFS
 */
public class Main {
    static int[] check = new int[100001];
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    private static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        check[n] = 1;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next = 0;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }


                if (next == K) {
                    System.out.println(check[temp]);
                    return;
                }

                if (next >= 0 && next <= 100000 && check[next] == 0) {
                    queue.add(next);
                    check[next] = check[temp] + 1;
                }
            }
        }
    }
}
