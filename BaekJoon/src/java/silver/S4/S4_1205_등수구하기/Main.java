package BaekJoon.src.java.silver.S4.S4_1205_등수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/1205
 * Problem: 등수구하기
 * Level: S4
 * Algorithm:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); //현재 점수 개수
        int score = Integer.parseInt(st.nextToken()); //등수 구할 점수
        int P = Integer.parseInt(st.nextToken()); //등록 가능한 점수 개수

        if(N != 0 )
            st = new StringTokenizer(br.readLine(), " ");

        int[] ranking = new int[N];
        for (int i = 0; i < N; i++) {
            ranking[i] = Integer.parseInt(st.nextToken());
        }

        if (N == P && ranking[N - 1] >= score) {
            System.out.println(-1);
            System.exit(0);
        }

        int rank = 1;
        for (int i : ranking) {
            if (i > score)
                rank++;
            else {
                break;
            }
        }
        System.out.println(rank);
    }
}
