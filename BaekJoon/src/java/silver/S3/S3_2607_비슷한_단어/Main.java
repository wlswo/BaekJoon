package BaekJoon.src.java.silver.S3.S3_2607_비슷한_단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/2607
 * Problem: 비슷한 단어
 * Level: S3
 * Algorithm: 문자열, 구현
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) - 1;
        String target = br.readLine();

        int[] alphabet = new int[26];
        for (int i = 0; i < target.length(); i++) {
            alphabet[target.charAt(i) - 'A']++;
        }

        int answer = 0;
        int cnt;
        while (n-- > 0) {
            cnt = 0;
            int[] arr = alphabet.clone();
            String tmp = br.readLine();
            for (int i = 0; i < tmp.length(); i++) {
                if (arr[tmp.charAt(i) - 'A'] > 0) {
                    cnt++;
                    arr[tmp.charAt(i) - 'A']--;
                }
            }

            if (tmp.length() + 1 == target.length()) {//abcd abc
                if (cnt == tmp.length())
                    answer++;
            }

            if (tmp.length() - 1 == target.length()) {//abc abcd
                if (cnt == target.length())
                    answer++;
            }

            if (tmp.length() == target.length()) {//abcd abcd
                if (cnt == tmp.length() - 1 || cnt == tmp.length()) {
                    answer++;
                }
            }

        }
        System.out.println(answer);
    }
}
