package BaekJoon.src.silver.S2.S2_18111_마인크래프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/18111
 * Problem: 마인크래프트
 * Level: S2
 * Algorithm: 브루트포스, 구현
 */
public class Main {
    static int[][] map;
    static int have;
    static int n;
    static int m;
    static int count = Integer.MAX_VALUE;
    static int height = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        have = Integer.parseInt(st.nextToken());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                map[i][j] = tmp;
                if (tmp > max) max = tmp;
                if (tmp < min) min = tmp;
            }
        }

        for (int i = min; i <= max; i++) {
            solve(i); //i 높이로 땅고르기
        }

        System.out.println(count + " " + height);
    }

    public static void solve(int current_height) {
        int current_have = have;
        int counting = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (current_height == map[i][j])
                    continue;

                if (current_height < map[i][j]) {//0 4 => 4-0 * 2 (블럭캐기)
                    counting += (map[i][j] - current_height) * 2;
                    current_have += map[i][j] - current_height;
                } else {//4 0
                    counting += (current_height - map[i][j]);
                    current_have -= (current_height - map[i][j]);
                }
            }
        }
        if(current_have < 0)
            return;

        if (count > counting) {
            count = counting;
            height = current_height;
        }
        if (count == counting && current_height > height) {
            height = current_height;
        }
    }
}
