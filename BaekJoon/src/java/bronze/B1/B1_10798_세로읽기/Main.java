package BaekJoon.src.java.bronze.B1.B1_10798_세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * BaekJoon
 * https://www.acmicpc.net/problem/10798
 * Problem: 세로읽기
 * Level: B1
 * Algorithm: 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                arr[i][j] = '-';
            }
        }

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 15; row++) {
            for (int col = 0; col < 5; col++) {
                if(arr[col][row] != '-')
                    sb.append(arr[col][row]);

            }
        }

        System.out.println(sb);

    }
}
