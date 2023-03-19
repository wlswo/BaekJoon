package BaekJoon.src.silver.S3.S3_2512_예산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/2512
 * Problem: 예산
 * Level: S3
 * Algorithm: 구현
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            max = Math.max(max, tmp);
            arr[i] = tmp;
        }

        int budget = Integer.parseInt(br.readLine());
        int avg = budget/n;

        int total = 0;
        //1. 주어진 돈으로 전부 지급할수 있는지
        for(int i : arr) {
            total += i;
        }

        if(total <= budget) {
            System.out.println(max);
        }
        else {
            //상한액
            int limit = max;
            while (true) {
                int tmp = 0;
                for(int i : arr) {
                    if(i <= limit)
                        tmp += i;
                    else
                        tmp += limit;
                }

                if(tmp > budget)
                    limit--;
                else
                    break;
            }
            System.out.println(limit);
        }
    }
}

/**
 * 120 110 140 150
 * 485
 * 총합 : 520
 * 평균 : 121
 */
