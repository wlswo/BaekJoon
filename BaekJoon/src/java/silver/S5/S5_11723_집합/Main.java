package BaekJoon.src.java.silver.S5.S5_11723_집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/11723
 * Problem: 집합
 * Level: S5
 * Algorithm: 구현, 비트마스킹
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int bitmask = 0; //int 4바이트 0000 0000 0000 0000 0000 0000 0000 0000 (32비트)

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String[] str = br.readLine().split(" ");
            String operation = str[0];
            int num = 0;
            if(str.length == 2)
                num = Integer.parseInt(str[1]) - 1;

            switch (operation) {
                case "add":
                    bitmask = bitmask | (1 << num);
                    break;
                case "remove":
                    bitmask = bitmask & ~( 1 << num);
                    break;
                case "check":
                    if ((bitmask & (1 << num)) != 0) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "toggle":
                    if((bitmask & ( 1 << num)) == 0){
                        bitmask = bitmask | (1 << num);
                    }else{
                        bitmask = bitmask & ~(1 << num);
                    }
                    break;
                case "all":
                    bitmask = bitmask | (~0);
                    break;
                case "empty":
                    bitmask = 0;
                    break;
            }
        }
        System.out.println(sb);

    }
}


/**
 * Set 자료구조를 이용한 풀이
 */
class Solution{
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String[] str = br.readLine().split(" ");
            String operation = str[0];
            int num = 0;
            if(str.length == 2)
                num = Integer.parseInt(str[1]);

            switch (operation) {
                case "add":
                    set.add(num);
                    break;
                case "remove":
                    set.remove(num);
                    break;
                case "check":
                    if (set.contains(num)) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "toggle":
                    if(set.contains(num)){
                        set.remove(num);
                    }else{
                        set.add(num);
                    }
                    break;
                case "all":
                    for (int i = 1; i <= 20; i++) set.add(i);
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
