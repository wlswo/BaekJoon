package BaekJoon.src.silver.S3.S3_20310_타노스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/20310
 * Problem: 타노스
 * Level: S3
 * Algorithm: 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] target = br.readLine().split("");

        int zero_cnt = 0;
        int one_cnt = 0;

        for(int i=0; i<target.length; i++) {
            if(target[i].equals("0")) zero_cnt++;
            else one_cnt++;
        }
        zero_cnt /= 2;
        one_cnt /= 2;

        int j = target.length-1;
        for(int i=0; i<target.length; i++, j--) {
            if(one_cnt != 0 && target[i].equals("1")) {
                target[i] = "2";
                one_cnt--;
            }
            if(zero_cnt != 0 && target[j].equals("0")) {
                target[j] = "2";
                zero_cnt--;
            }
            if(one_cnt == 0 && zero_cnt == 0) break;
        }

        String answer = "";
        for(String s : target) {
            if(!s.equals("2"))
                answer += s;
        }
        System.out.println(answer);
    }
}
