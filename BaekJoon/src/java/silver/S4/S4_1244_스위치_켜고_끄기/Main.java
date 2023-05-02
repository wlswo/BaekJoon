package BaekJoon.src.java.silver.S4.S4_1244_스위치_켜고_끄기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * BaekJoon
 * https://www.acmicpc.net/problem/1244
 * Problem: 스위치 켜고 끄기
 * Level: S4
 * Algorithm: 구현, 시뮬레이션
 */
public class Main {
    static String[] switchs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //스위치 개수
        switchs = br.readLine().split(" "); //스위치
        int stds = Integer.parseInt(br.readLine()); //학생 수

        Node[] nodes = new Node[stds];
        StringTokenizer st;
        for (int i = 0; i < stds; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            nodes[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (Node node : nodes) {
            if (node.gender == Gender.man) {
                int num = node.num - 1;
                for (int i = num; i < switchs.length; i += num + 1) {
                    changeSwitch(i);
                }
            } else {
                int cnt = 0;
                int num = node.num - 1;
                if (num == 0) {
                    changeSwitch(0);
                } else if (num == switchs.length - 1) {
                    changeSwitch(switchs.length - 1);
                } else {
                    cnt = 0;
                    int middle = num;
                    int left = num - 1;
                    int right = num + 1;

                    while (true) {
                        if (left < 0 || right > switchs.length - 1)
                            break;

                        if (!switchs[left].equals(switchs[right])) {
                            if (cnt == 0) {
                                changeSwitch(middle);
                                break;
                            }
                            break;
                        }

                        if (switchs[left].equals(switchs[right])) {
                            changeSwitch(left);
                            changeSwitch(right);
                            cnt++;
                            left--;
                            right++;
                        }
                    }
                    if (cnt != 0)
                        changeSwitch(middle);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(String s : switchs) {
            if(cnt/20 == 1) {
                sb.append("\n");
                cnt = 0;
            }

            sb.append(s).append(" ");
            cnt++;
        }
        System.out.println(sb);
    }

    public static void changeSwitch(int idx) {
        if (switchs[idx].equals("0"))
            switchs[idx] = "1";
        else
            switchs[idx] = "0";
    }
}

class Node {
    Gender gender;
    int num;

    Node(int gender, int num) {
        this.gender = gender == 1 ? Gender.man : Gender.girl;
        this.num = num;
    }
}

enum Gender {
    man, girl
}

