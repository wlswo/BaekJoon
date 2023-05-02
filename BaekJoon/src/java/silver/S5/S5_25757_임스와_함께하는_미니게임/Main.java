package BaekJoon.src.java.silver.S5.S5_25757_임스와_함께하는_미니게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/25757
 * Problem: 임스와 함께하는 미니게임
 * Level: S5
 * Algorithm: 자료 구조, 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        Set<String> set = new HashSet<>();

        int max = 0;
        if(game.equals("Y")) max = 1;
        if(game.equals("F")) max = 2;
        if(game.equals("O")) max = 3;

        while (N-- > 0) {
            set.add(br.readLine());
        }

        //4 명이서 하는게임에 7명 참여?
        System.out.println(set.size()/max);
    }
}
