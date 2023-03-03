package BaekJoon.src.gold.G5.G5_14503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Baekjoon
 * https://www.acmicpc.net/problem/14503
 * Problem: 14503
 * Level: G5
 * Algorithm: 구현, 시뮬레이션
 */

public class Main {
    static boolean[][] visited;
    static int[][] room;
    //방향 0(위쪽) 1(왼쪽) 2(오른쪽) 3(아래쪽)
    static int dx[] = {-1, 0, 1, 0};  // 북동남서
    static int dy[] = {0, 1, 0, -1};

    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        room = new int[N][M];

        st = new StringTokenizer(br.readLine(), " ");
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) { //col
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(new Robot(col, row, d));
        System.out.println(cnt);
    }

    public static void dfs(Robot robot) {
        //1. 현재 위치를 청소한다.
        room[robot.col][robot.row] = 2;
        int d = robot.d;

        //2. 왼쪽방향부터 차례로 청소한다.
        for (int i = 0; i < 4; i++) {
            d = (d + 3) % 4;
            int nc = robot.col + dx[d];
            int nr = robot.row + dy[d];

            if (nc < 0 || nr < 0 || nc >= room.length || nr >= room[0].length)
                continue;

            if (room[nc][nr] != 0)
                continue;

            cnt++;
            dfs(new Robot(nc, nr, d));
            return;
        }

        //3. 네 방향 모두가 청소되어있거나 벽인경우
        int back = (d + 2) % 4; //뒤로 후진
        int nc = robot.col + dx[back];
        int nr = robot.row + dy[back];

        if (nc >= 0 && nr >= 0 && nc < room.length && nr < room[0].length && room[nc][nr] != 1) {
            dfs(new Robot(nc, nr, d));
        }

    }
}

class Robot {
    int col;
    int row;
    int d;

    public Robot(int col, int row, int d) {
        this.col = col;
        this.row = row;
        this.d = d;
    }
}
