package BaekJoon.src.gold.G5.G5_15686_치킨배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * Programmers
 * https://www.acmicpc.net/problem/15686
 * Problem: 치킨 배달
 * Level: G5
 * Algorithm: 백트래킹
 */
class Node {
    int col;
    int row;

    Node(int col, int row) {
        this.row = row;
        this.col = col;
    }
}

public class Main {
    static int[][] map;
    static ArrayList<Node> houseList = new ArrayList<>();
    static ArrayList<Node> chickenList = new ArrayList<>();
    static boolean[] visited;
    static int size;
    static int M;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        size = N;

        int idx = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < size; i++) {
                map[idx][i] = Integer.parseInt(st.nextToken());
                if (map[idx][i] == 1) houseList.add(new Node(idx, i));
                else if (map[idx][i] == 2) chickenList.add(new Node(idx, i));
            }
            idx++;
        }

        visited = new boolean[chickenList.size()];

        backtracking(0, 0);
        System.out.println(answer);
    }

    public static void backtracking(int depth, int idx) {

        if (depth == M) {
            int total = 0;

            for (int i = 0; i < houseList.size(); i++) {
                int sum = Integer.MAX_VALUE;
                for (int j = 0; j < chickenList.size(); j++) {
                    if (visited[j] == true) {
                        int distance = Math.abs(houseList.get(i).col - chickenList.get(j).col)
                                + Math.abs(houseList.get(i).row - chickenList.get(j).row);
                        sum = Math.min(sum, distance);
                    }
                }
                total += sum;
            }

            answer = Math.min(answer, total);
            return;
        }

        for (int i = idx; i < chickenList.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(depth+1, i + 1);
                visited[i] = false;
            }
        }
    }
}
