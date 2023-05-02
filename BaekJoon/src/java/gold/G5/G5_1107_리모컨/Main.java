package BaekJoon.src.java.gold.G5.G5_1107_리모컨;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/1107
 * Problem: 리모컨
 * Level: G5
 * Algorithm: 브루트포스, 구현
 */
public class Main {
    static int target;
    static boolean[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        target = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        arr = new boolean[10]; //0~9
        if (n != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreElements()) {
                arr[Integer.parseInt(st.nextToken())] = true;
            }
        }

        int num = Math.abs(target - 100);
        for (int i = 0; i < 1000000; i++) {
            int check = check(i);
            if(check != 0)
                num = Math.min(num, Math.abs(target - i) + check);
        }

        System.out.println(num);

    }

    static int check(int i) { //자리수를 리턴
        if(i == 0) {
            if(arr[i])
                return 0;
            else
                return 1;
        }

        int cnt = 0;
        while (i > 0) {
            if(arr[i%10])
                return 0;

            cnt++;
            i /= 10;
        }
        return cnt;
    }
}
