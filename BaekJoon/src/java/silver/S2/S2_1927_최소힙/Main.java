package BaekJoon.src.java.silver.S2.S2_1927_최소힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * Programmers
 * https://www.acmicpc.net/problem/1927
 * Problem: 최소 힙
 * Level: S2
 * Algorithm: 자료구조, 우선순위 큐
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(queue.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(queue.poll());
                }
            }else {
                queue.add(x);
            }

        }

    }
}
