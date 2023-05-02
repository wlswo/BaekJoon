package BaekJoon.src.java.silver.S3.S3_2606_바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int cnt = 0;
    static int[][] node;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer_counter = Integer.parseInt(br.readLine());
        int repeat = Integer.parseInt(br.readLine());

        node = new int[computer_counter+1][computer_counter+1];
        check = new boolean[computer_counter+1];

        for(int i=0; i<repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 간선은 서로 연결되어 있다.
            node[a][b] = 1;
            node[b][a] = 1;
        }

        bfs(1);
        System.out.println(cnt);
    }

    static public void bfs(int num) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(num);
        check[num] = true;

        while (!queue.isEmpty()) {
            // 1. 담겨있는 노드를 뺀다.
            int current = queue.poll();

            // 2. 노드를 순회한다.
            for (int i = 1; i < node.length; i++) {
                // 3. 연결되어있는 간선과 체크안되어있는 컴퓨터이면
                if (node[i][current] == 1 && !check[i]) {
                    queue.offer(i);
                    check[i] = true;
                    cnt++;
                }
            }
        }
    }
}
