package BaekJoon.src.silver.S5.S5_25206_너의평점은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/25206
 * Problem: 너의 평점은
 * Level: S5
 * Algorithm: 수학, 구현, 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float grade = 0;
        float sum = 0;

        for (int i = 0; i < 20; i++) {
            String[] arr = br.readLine().split(" ");
            if(arr[2].equals("P")){
                continue;
            }
            sum += Float.parseFloat(arr[1]) * getAvg(arr[2]);
            grade += Float.parseFloat(arr[1]);
        }

        System.out.printf("%f",(sum/grade));
    }

    private static float getAvg(String s) {
        switch (s){
            case "A+":
                return 4.5F;
            case "A0":
                return 4.0F;
            case "B+":
                return 3.5F;
            case "B0":
                return 3.0F;
            case "C+":
                return 2.5F;
            case "C0":
                return 2.0F;
            case "D+":
                return 1.5F;
            case "D0":
                return 1.0F;
            default:
                return 0.0F;
        }
    }
}
