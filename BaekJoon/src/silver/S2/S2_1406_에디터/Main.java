package BaekJoon.src.silver.S2.S2_1406_에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        Stack<Character> lStack = new Stack<>();
        Stack<Character> rStack = new Stack<>();

        for(int i=0; i<word.length(); i++) {
            lStack.push(word.charAt(i));
        }
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            String order = br.readLine();
            switch (order) {
                case "L":
                    if(lStack.isEmpty()) break;
                    rStack.push(lStack.pop());
                    break;
                case "D":
                    if(rStack.isEmpty()) break;
                    lStack.push(rStack.pop());
                    break;
                case "B":
                    if(lStack.isEmpty()) break;
                    lStack.pop();
                    break;
                default:
                    lStack.push(order.charAt(2));
                    break;
            }
        }

        while (!lStack.isEmpty()) {
            rStack.push(lStack.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!rStack.isEmpty()) {
            sb.append(rStack.pop());
        }
        System.out.println(sb);
    }
}
