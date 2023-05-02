package BaekJoon.src.java.silver.S5.S5_2563_색종이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Programmers
 * https://school.programmers.co.kr/learn/courses/30/lessons/2563
 * Problem: 색종이
 * Level: S5
 * Algorithm: 구현
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] map = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int row = Integer.parseInt(st.nextToken()) -1;
            int col = Integer.parseInt(st.nextToken()) -1;

            for(int c=col; c<col+10; c++) {
                for(int r=row; r<row+10; r++) {
                    map[c][r] = true;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(map[i][j])
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
