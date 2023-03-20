package BaekJoon.src.silver.S1.S1_2529_부등호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/2529
 * Problem: 부등호
 * Level: S1
 * Algorithm: 브루트포스, 백트래킹
 */
public class Main {

    static String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static boolean[] check = new boolean[10];
    static String[] sign;
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        sign = br.readLine().split(" ");

        dfs(0, "");

        System.out.println(list.get(list.size() - 1));
        System.out.print(list.get(0));

    }

    public static void dfs(int depth, String s) {
        if(depth == sign.length + 1) { //부등호개수 보다 +1 개
            list.add(s);
            return;
        }

        for(int i=0; i<10; i++) {
            if(check[i])
                continue;

            // Character.getNumericValue : char -> int 형으로 변환 (선택한 숫자)
            if(depth == 0 || isPossible(Character.getNumericValue(s.charAt(depth -1)),i,sign[depth-1])) {
                check[i] = true;
                dfs(depth + 1, s + i);
                check[i] = false;
            }
        }
    }

    public static boolean isPossible(int x, int y, String s) {
        if(s.equals(">")) {
            if(x < y)
                return false;
        }else if(s.equals("<")){
            if(x > y)
                return false;
        }
        return true;
    }

}
