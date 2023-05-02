package silver.S4_11507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashSet<String> hs = new HashSet<String>();
		boolean distinct = true;
		int cnt[] = new int[4];
		
		for(int i=0; i<str.length(); i+=3) {
			String card = str.substring(i, i+3);
			if( hs.contains(card) ) {
				System.out.println("GRESKA");
				distinct = false;
				return;
			}
			
			hs.add(card);
			
			switch (card.charAt(0)) {
			case 'P' : cnt[0]++; break;
			case 'K' : cnt[1]++; break;
			case 'H' : cnt[2]++; break;
			case 'T' : cnt[3]++; break;
			
			}
			
		}
		StringBuilder sb = new StringBuilder();
		if(distinct) {
			for(int i=0; i<4; i++) {
				sb.append(13-cnt[i]+" ");
			}
			System.out.println(sb);
		}
		
	}

}
