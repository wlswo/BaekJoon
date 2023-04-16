package BaekJoon.src.silver.S1.S1_14940_쉬운최단거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/14940
 * Problem: 쉬운 최단거리
 * Level: S1
 * Algorithm: 넓이우선탐색 
 */
public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());

        map = new int[col][row];
        visited = new boolean[col][row];

        int tmpi = 0;
        int tmpj = 0;

        for (int i = 0; i < col; i++) {
            String[] a = br.readLine().split(" ");
            for (int j = 0; j < row; j++) {
                map[i][j] = Integer.parseInt(a[j]);
                if(map[i][j] == 2){
                    tmpi = i;
                    tmpj = j;
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(map[i][j] == 2) {
                    bfs(i,j);
                }
            }
        }

        map[tmpi][tmpj] = 0;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
               if(!visited[i][j] && map[i][j] == 1) {
                   map[i][j] = -1;
               }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(int col, int row) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(col, row,0));

        visited[col][row] = true;
        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nc = node.col + dx[i];
                int nr = node.row + dy[i];

                if (nc >= 0 && nc <= map.length-1 && nr >= 0 && nr <= map[0].length-1 && !visited[nc][nr]) {
                    if(map[nc][nr] == 0)
                        continue;

                    map[nc][nr] = node.cnt+1;
                    visited[nc][nr] = true;
                    queue.add(new Node(nc,nr, node.cnt+1));
                }
            }
        }
    }
}

class Node{
    int col;
    int row;
    int cnt;

    public Node(int col, int row, int cnt) {
        this.col = col;
        this.row = row;
        this.cnt = cnt;
    }
}
