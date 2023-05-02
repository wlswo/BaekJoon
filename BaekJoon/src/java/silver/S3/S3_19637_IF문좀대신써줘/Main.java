package BaekJoon.src.java.silver.S3.S3_19637_IF문좀대신써줘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/19637
 * Problem: IF 문좀 대신 써줘
 * Level: S3
 * Algorithm: 이분탐색, 구현
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String word = st.nextToken();
            String power = st.nextToken();
            arr[i][0] = word;
            arr[i][1] = power;
        }


        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            int target = Integer.parseInt(br.readLine());
            int left = 0;
            int right = n - 1;
            int mid;

            while (left <= right) {
                mid = (left + right) / 2;

                int middle = Integer.parseInt(arr[mid][1]);

                if (target <= middle) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
            sb.append(arr[left][0]).append("\n");
        }
        System.out.println(sb);
    }
}

