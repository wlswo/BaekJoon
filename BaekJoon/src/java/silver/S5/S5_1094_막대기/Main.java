package BaekJoon.src.java.silver.S5.S5_1094_막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


/**
 * Programmers
 * https://www.acmicpc.net/problem/1094
 * Problem: 막대기
 * Level: S5
 * Algorithm: 구현
 */
public class Main {
    static int total = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue();
        queue.add(64);

        while (true) {
            if(total > X) {
                int tmp = queue.poll();
                if(total-tmp/2 >= X) {
                    total -= tmp/2;
                    queue.add(tmp/2);
                }else {
                    queue.add(tmp/2);
                    queue.add(tmp/2);
                }


            } else if (total == X) {
                System.out.println(queue.size());
                break;
            }

        }
    }
}
