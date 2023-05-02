package BaekJoon.src.java.silver.S5.S5_7785_회사에있는사람;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            String[] s = br.readLine().split(" ");
            if(s[1].equals("enter")) {
                map.put(s[0],1);
            }else {
                map.remove(s[0]);
            }
        }

        String[] names = map.keySet().toArray(new String[0]);
        Arrays.sort(names,Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
