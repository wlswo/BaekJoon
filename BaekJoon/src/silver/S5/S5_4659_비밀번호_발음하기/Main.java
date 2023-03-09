package BaekJoon.src.silver.S5.S5_4659_비밀번호_발음하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/4659
 * Problem: 비밀번호 발음하기
 * Level: S5
 * Algorithm: 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String word = br.readLine();
            if (word.equals("end"))
                break;

            sb.append("<").append(word).append(">");
            if (check(word)) sb.append(" is acceptable.").append("\n");
            else sb.append(" is not acceptable.").append("\n");
        }
        System.out.println(sb);

    }

    public static boolean check(String word) {
        List<Character> arr = new ArrayList<>();
        arr.add('a');
        arr.add('e');
        arr.add('i');
        arr.add('o');
        arr.add('u');


        //1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
        if (!word.contains("a") && !word.contains("e") && !word.contains("i") && !word.contains("o") && !word.contains("u")) {
            return false;
        }

        //2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
        for (int i = 0; i <= word.length() - 3; i++) {
            if (arr.contains(word.charAt(i)) && arr.contains(word.charAt(i + 1)) && arr.contains(word.charAt(i + 2))) {
                return false;
            }
            if (!arr.contains(word.charAt(i)) && !arr.contains(word.charAt(i + 1)) && !arr.contains(word.charAt(i + 2))) {
                return false;
            }
        }

        //3. 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
        for (int i = 0; i <= word.length() - 2; i++) {
            if (word.charAt(i) == word.charAt(i + 1) && word.charAt(i) != 'e' && word.charAt(i) != 'o')
                return false;
        }

        return true;
    }
}
