package BaekJoon.src.java.bronze.B1.B1_9506_약수들의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/9506
 * Problem: 약수들의 합
 * Level: B1
 * Algorithm: 정수론, 수학
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == -1)
                break;


            sb.append(n);
            List<Integer> list = new ArrayList<>();

            int sum = 0;
            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                sb.append(" =");
                for (int j=0; j<list.size(); j++) {
                    if(j == list.size()-1) {
                        sb.append(" ").append(list.get(j)).append("\n");
                    }else {
                        sb.append(" ").append(list.get(j)).append(" ").append("+");
                    }
                }
            }else {
                sb.append(" is NOT perfect.").append("\n");
            }
        }
        System.out.println(sb);
    }
}
