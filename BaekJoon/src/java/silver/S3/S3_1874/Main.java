package BaekJoon.src.java.silver.S3.S3_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int repeat = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int start = 0;

        while (repeat-- > 0) {
            int target = Integer.parseInt(br.readLine());

            /* 현재 스택 최상위 값과 입력의 값을 비교 (입력값이 더 클경우 push) */
            if(target > start) {
                for(int i=start+1; i<=target; i++) {
                    stack.push(i);
                    sb.append("+\n");
                }
                start = target;
            }

            /* 비교 */
            if(stack.peek() != target) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
