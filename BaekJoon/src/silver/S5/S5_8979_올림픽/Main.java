package BaekJoon.src.silver.S5.S5_8979_올림픽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/8979
 * Problem: 올림픽
 * Level: S5
 * Algorithm: 구현, 정렬
 */
class Country{
    int gold;
    int silver;
    int bronze;

    public Country(int gold, int silver, int bronze) {
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Country[] arr = new Country[n+1];

        for(int i=0; i<n; i++) {
             st = new StringTokenizer(br.readLine()," ");
             int num = Integer.parseInt(st.nextToken());
             int gold = Integer.parseInt(st.nextToken());
             int silver = Integer.parseInt(st.nextToken());
             int bronze = Integer.parseInt(st.nextToken());
             arr[num] = new Country(gold, silver, bronze);
        }


        int answer = 1;
        Country t = arr[k];
        for (int i = 1; i <= n; i++) {
            Country c = arr[i];
            if(c.gold > t.gold || (c.gold == t.gold && c.silver > t.silver) || (t.gold == c.gold && t.silver == c.silver && c.bronze > t.bronze))
                answer++;
        }
        System.out.println(answer);
    }
}
