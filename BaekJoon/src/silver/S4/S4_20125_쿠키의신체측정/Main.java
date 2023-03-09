package BaekJoon.src.silver.S4.S4_20125_쿠키의신체측정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/20125
 * Problem: 쿠키의 신체 측정
 * Level: S4
 * Algorithm: 구현
 */
public class Main {
    static String[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new String[N];

        for (int col = 0; col < N; col++) {
            map[col] = br.readLine();
        }


        int head_idx = 0;
        boolean head_check = true;

        int heart_col = 0;

        boolean hand_check = true;
        int left_hand = 0;
        int right_hand = 0;

        int body = 0;

        int left_leg = 0;
        int right_leg = 0;

        for (int col = 0; col < N; col++) {
            for (int row = 0; row < N; row++) {
                if (head_check && map[col].charAt(row) == '*') {
                    head_idx = row;
                    heart_col = col+1;
                    head_check = false;
                    break;
                }

                if(hand_check && map[col].charAt(row) == '*') {
                    String hand = map[col];
                    for(int i=row; i<N; i++){
                        if(i < head_idx && hand.charAt(i) == '*') left_hand++;
                        if(i > head_idx && hand.charAt(i) == '*') right_hand++;
                    }
                    hand_check = false;
                    break;
                }

                if (head_idx == row && map[col].charAt(head_idx) == '*') {
                    body++;
                    continue;
                }

                if (map[col].charAt(row) == '*') {
                    String legs = map[col];
                    if(row < head_idx && legs.charAt(row) == '*') left_leg++;
                    if(row > head_idx && legs.charAt(row) == '*') right_leg++;
                }
            }
        }

        System.out.println( (heart_col+1)+" "+(head_idx+1));
        System.out.printf("%d %d %d %d %d",left_hand,right_hand,body,left_leg,right_leg);

    }
}
