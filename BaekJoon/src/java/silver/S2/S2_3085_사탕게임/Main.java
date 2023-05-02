package BaekJoon.src.java.silver.S2.S2_3085_사탕게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/3085
 * Problem: 사탕 게임
 * Level: S2
 * Algorithm: 구현, 브루트포스
 */
public class Main {
    static String[][] map;
    static int N;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new String[N][N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = s[j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                String temp = map[i][j];
                map[i][j] = map[i][j + 1];
                map[i][j + 1] = temp;

                //행, 열 검사
                getColumn();
                getRow();


                //복구
                temp = map[i][j];
                map[i][j] = map[i][j + 1];
                map[i][j + 1] = temp;
            }
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                String temp = map[i][j];
                map[i][j] = map[i + 1][j];
                map[i + 1][j] = temp;

                //행, 열 검사
                getRow();
                getColumn();


                //복구
                temp = map[i][j];
                map[i][j] = map[i + 1][j];
                map[i + 1][j] = temp;
            }
        }
        System.out.println(answer);
    }

    private static void getColumn() {
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N - 1; j++) {
                if (map[i][j].equals(map[i][j + 1])) {
                    cnt++;
                } else {
                    cnt = 1;
                }

                answer = Math.max(answer, cnt);
            }
        }
    }

    private static void getRow() {
        for (int i = 0; i < N ; i++) {
            int cnt = 1;
            for (int j = 0; j < N-1; j++) {
                if (map[j][i].equals(map[j + 1][i])) {
                    cnt++;
                } else {
                    cnt = 1;
                }

                answer = Math.max(answer, cnt);
            }
        }
    }
}
