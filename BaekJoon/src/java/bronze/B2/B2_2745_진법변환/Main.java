package BaekJoon.src.java.bronze.B2.B2_2745_진법변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/2745
 * Problem: 진법 변환
 * Level: B2
 * Algorithm: 수학, 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] arr = st.nextToken().toCharArray();

        int r = Integer.parseInt(st.nextToken());
        int idx = 0;
        int answer = 0;
        int num = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            char c = arr[i];
            if (c >= '0' && c <= '9') {
                num = c - '0';
            } else {
                num = c - 55;
            }
            answer += num * Math.pow(r,idx);
            idx++;
        }
        System.out.println(answer);
    }
}
