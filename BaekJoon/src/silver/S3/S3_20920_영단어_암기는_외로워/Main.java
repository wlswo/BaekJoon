package BaekJoon.src.silver.S3.S3_20920_영단어_암기는_외로워;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * BaekJoon
 * https://www.acmicpc.net/problem/20920
 * Problem: 영단어 암기는 외로워
 * Level: s3
 * Algorithm: 자료구조, 정렬
 */
public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Word> queue = new PriorityQueue<>(new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                if (o1.cnt == o2.cnt) {
                    if (o1.word.length() == o2.word.length()) {
                        return o1.word.compareTo(o2.word);
                    }
                    return o2.word.length() - o1.word.length();
                } else {
                    return o2.cnt - o1.cnt;
                }
            }
        });

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() < limit)
                continue;

            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        Set<String> keys = map.keySet();
        for (String s : keys) {
            queue.add(new Word(s, map.get(s)));
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll().word).append("\n");
        }
        System.out.println(sb);
    }

    static class Word {
        String word;
        int cnt;

        Word(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
}
