package BaekJoon.src.silver.S1.S1_1747_소수와팰린롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        while (true) {
            if(isPrime(number) && isPalindrome(number)) {
                 break;
            }
            number++;
        }
        System.out.println(number);
    }

    static public boolean isPrime(int target) {
        if (target == 1) return false;

        for(int i=2; i<=Math.sqrt(target); i++) {
            if( target%i == 0) {
                return false;
            }
        }
        return true;
    }

    static public boolean isPalindrome(int target) {
        String targetToString = String.valueOf(target);

        /* 자릿수 짝수 경우 */
        if(targetToString.length()%2 == 0) {
            for(int i=0; i<targetToString.length()/2; i++) {
                if(targetToString.charAt(i) != targetToString.charAt(targetToString.length()-1-i)){
                    return false;
                }
            }
            return true;
        }

        /* 자릿수 홀수인 경우 */
        for(int i=0; i<targetToString.length()/2; i++) {
            if(targetToString.charAt(i) != targetToString.charAt(targetToString.length()-1-i)) {
                return false;
            }
        }

        return true;
    }

}

/*
            if ( 소수면 )
                if(팰린드롬 이면)
                    return
                ++
*/