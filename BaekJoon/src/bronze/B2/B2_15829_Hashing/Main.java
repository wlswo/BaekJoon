package BaekJoon.src.bronze.B2.B2_15829_Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = br.readLine();
        long answer = 0;

        for (int i = 0; i < word.length(); i++) {
            int target = word.charAt(i) - 96;
            answer += target * Math.pow(31,i);
        }
        System.out.println(answer);
    }
}
