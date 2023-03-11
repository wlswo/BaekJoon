package BaekJoon.src.silver.S3.S3_21921_블로그;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * BaekJoon
 * https://www.acmicpc.net/problem/21921
 * Problem: 블로그
 * Level: S3
 * Algorithm: 누적합, 슬라이딩 윈도우
 */
public class Main {
    static int cnt =1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solve(arr, X, N);
    }

    // 슬라이딩 윈도우 기법 사용
    public static void solve(int[] hit, int X, int N) {
        // X일 마다의 방문자수의 합
        int sum = 0;
        for (int i = 0; i < X; i++) {
            sum += hit[i];
        }

        // 최대 방문자 수
        int max = sum;

        for (int i = X; i < N; i++) {
            sum -= hit[i - X]; // 첫 요소 제외
            sum += hit[i]; // 새롭게 나타나는 요소 더하기

            // 최댓값 갱신
            if (max < sum) {
                cnt = 0; // 최댓값 갱신되면 카운팅 0으로 초기화
                cnt++;
                max = sum;
            } else if (max == sum) cnt++; // 최댓값과 같은 기간이 나오면 카운팅

        }

        if (max == 0) {
            // 만약 최대방문자수가 0명이라면 SAD 출력
            System.out.println("SAD");
            return;
        }

        System.out.println(max + "\n" + cnt);
    }
}
