package BaekJoon.src.silver.S4.S4_9017_크로스컨트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/9017
 * Problem: 크로스 컨트리
 * Level: S4
 * Algorithm: 구현
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int tmp = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] team = new int[tmp + 1]; //팀
            int max = 0;

            int[] teams = new int[1001];

            for (int i = 1; i <= tmp; i++) {
                team[i] = Integer.parseInt(st.nextToken());
                if (team[i] > max)
                    max = team[i];

                teams[team[i]]++;
            }

            //n/a 팀 체크
            ArrayList<Integer> na = new ArrayList<>();
            na.add(0);
            for (int i = 1; i <= max; i++) {
                if (teams[i] < 6)
                    na.add(i);
            }

            Map<Integer, Integer> map = new HashMap<>(); //팀별 점수
            Map<Integer, Integer> five = new HashMap<>(); //팀별 5등 점수

            int[] team_count = new int[1001];

            int cnt = 1;
            for (int i : team) {
                if (na.contains(i))
                    continue;

                team_count[i]++;
                if (team_count[i] == 5) {
                    five.put(i, cnt);
                    cnt++;
                    continue;
                } else if (team_count[i] == 6) {
                    cnt++;
                    continue;
                }

                map.put(i, map.getOrDefault(i, 0) + cnt);
                cnt++;
            }

            //최고점수 ( 낮을수록 순위가 높음 )
            int min = Integer.MAX_VALUE;
            for (int i : map.keySet()) {
                if (min > map.get(i))
                    min = map.get(i);
            }


            int[] best = {Integer.MAX_VALUE, 0}; // (점수, 팀)
            for (int i : map.keySet()) {
                if (map.get(i) == min && best[0] > five.get(i)) {
                    best[0] = five.get(i);
                    best[1] = i;
                }

            }

            sb.append(best[1]).append("\n");
        }

        System.out.println(sb);

    }
}
