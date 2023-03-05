package BaekJoon.src.bronze.B4.B4_23971_ZOAC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Programmers
 * https://www.acmicpc.net/problem/23971
 * Problem: ZOAC 4
 * Level: B4
 * Algorithm: 수학, 패턴
 */
public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * H : col
         * W : row
         * N : col 이상
         * M : row 이상
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double col = Double.parseDouble(st.nextToken());
        double row = Double.parseDouble(st.nextToken());
        int N = Integer.parseInt(st.nextToken()) + 1;
        int M = Integer.parseInt(st.nextToken()) + 1;

        System.out.println((int)(Math.ceil(row/M) * Math.ceil(col/N)));

        //하나의 행에 M칸 씩 거리 두어서 앉기 => 하나의 행의 학생수 =>  row 의 개수 / M+1 의 올림
        //하나의 열의 N칸 씩 거리 두어서 앉기 => 하나의 열의 학생수 =>  col 의 개수 / N+1 의 올림
    }
}
