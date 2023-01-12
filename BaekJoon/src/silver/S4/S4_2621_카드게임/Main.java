package BaekJoon.src.silver.S4.S4_2621_카드게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Card {
    private String color;
    private int number;

    Card(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }
    public int getNumber() {
        return number;
    }
}

public class Main {

    static int[] colorIndex = new int[4];   //[R,B,Y,G]
    static int[] numberIndex = new int[10];

    static int max = 0;
    static int score = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String _color = st.nextToken();
            int _number = Integer.parseInt(st.nextToken());

            if(max < _number) max = _number;

            switch (_color){
                case "R":
                    colorIndex[0]++;
                    break;
                case "B":
                    colorIndex[1]++;
                    break;
                case "Y":
                    colorIndex[2]++;
                    break;
                case "G":
                    colorIndex[3]++;
                    break;
            }

            numberIndex[_number]++;
        }
        calcCard();
        System.out.println(score);
    }

    public static void calcCard() {
        /* 색상이 같은 경우 */
        for(int n : colorIndex) {
            if(n == 5) {
                //플러쉬 OK
                flush();
                //스트레이트플러쉬인지
                loop:
                for(int i=1; i<10; i++) {
                    if(numberIndex[i] == 1 && i < 6) {
                        for(int j=i; j<i+5; j++) {
                            if(numberIndex[j] != 1) break loop;
                        }
                        //스트레이트플러쉬 OK
                        straightflush();
                    }
                }
            }
        }
        /* 숫자가 같은 경우 */
        //Arrays.sort(numberIndex);

        int pair1 = 0;
        int pair2 = 0;
        int triple = 0;
        int quad = 0;

        for(int i=1; i<numberIndex.length; i++) {
            int n = numberIndex[i];

            loop:
            if(n == 1 && i < 6) {
                for(int j=i; j<i+5; j++) {
                    if(numberIndex[j] != 1) {
                        break loop;
                    }
                }
                straight();
            }

            if(n == 2) {
                if(pair1 == 0) {
                    pair1 = i;
                }else {
                    pair2 = i;
                }
            }
            if(n == 3) {
                triple = i;
            }
            if(n == 4) {
                quad = i;
            }
        }

        if(pair1 != 0 && pair2 !=0 ) {
            twoPair(pair1, pair2);
        }else if( (pair1 != 0 && pair2 ==0 && triple == 0) || (pair1 == 0 && pair2 !=0 && triple == 0) ) {
            onePair(pair1 == 0 ? pair2 : pair1);
        }else if( (triple != 0 && pair1 != 0) || (triple != 0 && pair2 != 0) ) {
            fullHouse(triple, pair1 == 0 ? pair2 : pair1);
        }else if(triple != 0 && pair1 == 0 && pair2 == 0) {
            triple(triple);
        }else if(quad != 0) {
            fourCard(quad);
        }else {
            highCard();
        }

    }

    public static void straightflush() {
        if(max + 900 > score) {
            score = max + 900;
        }
    }

    public static void fourCard(int num) {
        if(num + 800 > score) {
            score = num + 800;
        }
    }

    public static void fullHouse(int triple, int pair) {
        if( triple * 10 + pair + 700 > score) {
            score = triple * 10 + pair + 700;
        }
    }

    public static void flush() {
        if (max + 600 > score) {
            score = max + 600;
        }
    }

    public static void straight() {
        if(max + 500 > score) {
            score = max + 500;
        }
    }

    public static void triple(int triple) {
        if(triple + 400 > score) {
            score = triple + 400;
        }
    }

    public static void twoPair(int pair1, int pair2) {
        if(pair1 > pair2) {
          if(score < (pair1 * 10) + (pair2 + 300) ) {
              score = (pair1 * 10) + (pair2 + 300);
          }
        }

        if(score < (pair2 * 10) + (pair1 + 300) ) {
            score = (pair2 * 10) + (pair1 + 300);
        }
    }

    public static void onePair(int pair) {
        if(score < pair + 200) {
            score = pair + 200;
        }
    }

    public static void highCard() {
        if(score < max + 100) {
            score = max + 100;
        }
    }
}

/*
    1. 카드 5장이 모두 같은 색이면서 숫자가 연속적일 때
    2. 카드 5장 중 4장의 숫자가 같을 때
    3. 카드 5장 중 3장의 숫자가 같고 나머지 2장도 숫자가 같을 때
    4. 5장의 카드 색깔이 모두 같을 때
    5. 카드 5장의 숫자가 연속적일 때
    6. 카드 5장 중 3장의 숫자가 같을 때
    7. 카드 5장 중 2장의 숫자가 같고 또 다른 2장의 숫자가 같을 때
    8. 카드 5장 중 2장의 숫자가 같을 때
    9. 나머지 경우
 */

