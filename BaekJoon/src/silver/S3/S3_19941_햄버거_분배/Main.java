package BaekJoon.src.silver.S3.S3_19941_햄버거_분배;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/19941
 * Problem: 햄버거 분배
 * Level: S3
 * Algorithm: 그리디
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        String[] table = br.readLine().split("");
        boolean[] check = new boolean[table.length];

        int answer = 0;
        for (int i = 0; i < table.length; i++) {
            if(table[i].equals("H"))
                continue;

            int startIdx = Math.max(i - K, 0);
            int endIdx = Math.min(i+K,N-1);
            for (int j = startIdx; j <= endIdx; j++) {

                //먹지 않은 햄버거 이면서 거리가 K 이하인 곳
                if(table[j].equals("H") && !check[j]) {
                    check[j] = true;
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);

    }
}
