package BaekJoon.src.silver.S5.S5_10431_줄세우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/10431
 * Problem: 줄세우기
 * Level: S5
 * Algorithm: 구현, 시뮬레이션
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int idx = 1;
        while (n-- > 0) {
            String[] str = br.readLine().split(" ");

            int[] arr = new int[20];
            for (int i = 1; i <= 20; i++) {
                arr[i-1] = Integer.parseInt(str[i]);
            }

            int cnt = 0;
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<i; j++){
                    if(arr[j] > arr[i]) {
                        cnt++;
                    }
                }
            }
            sb.append(idx++).append(" ").append(cnt).append('\n');
        }

        sb.delete(sb.length()-1,sb.length());
        System.out.println(sb);
    }
}
