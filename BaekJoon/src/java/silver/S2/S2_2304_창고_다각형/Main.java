package BaekJoon.src.java.silver.S2.S2_2304_창고_다각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/2304
 * Problem: 창고 다각형
 * Level: S2
 * Algorithm: 그리디, 부르트포스
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        /**
         * Point
         * 꺽이는 그 시점까지의 넓이를 구하는것
         */
        ArrayList<int[]> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            list.add(arr);

            if (arr[1] > max) {
                max = arr[1];
                idx = arr[0];
            }
        }


        list.sort(Comparator.comparingInt(a -> a[0]));

        int sum = 0, x = list.get(0)[0], height = list.get(0)[1];

        for (int i = 0; i < list.size(); i++) {
            int[] t = list.get(i);

            if (t[1] >= height) {
                sum += (t[0] - x) * height;
                height = t[1];
                x = t[0];
            }
        }

        x = list.get(list.size()-1)[0]+1;
        height = list.get(list.size()-1)[1];
        idx++;

        for (int i = list.size() - 1; i >= 0; i--) {
            int[] t = list.get(i);
            if(t[0]+1 < idx)
                 break;

            if (t[1] > height) {
                sum += (x - t[0]-1) * height;
                height = t[1];
                x = t[0]+1;
            }
        }

        sum+= height;

        System.out.println(sum);
    }
}