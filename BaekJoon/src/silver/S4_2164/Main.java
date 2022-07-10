package silver.S4_2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		Deque<Integer> deck = new ArrayDeque<Integer>();
		
		//덱에 카드 쌓기 
		for(int i=1; i<=num; i++) {
			deck.add(i);
		}
		
		//1장이 될때 까지 
		while(deck.size() > 1) {
			 deck.pollFirst();
			 int a = deck.pollFirst();
			 deck.add(a);
			 
		}
		
		System.out.println(deck.pollFirst());
		
	}

}
