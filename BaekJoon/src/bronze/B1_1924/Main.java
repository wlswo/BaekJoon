package bronze.B1_1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{			
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int month = Integer.parseInt(st.nextToken());
		int day   = Integer.parseInt(st.nextToken());
		

		// 3, 5, 7, 8, 12 [31일]
		//4, 6, 9, 11		[30]
		
		//월요일 시작 
		if(month == 1 || month == 10) {
			
			switch(day%7) {
			
			case 1 : System.out.println("MON"); break;
			case 2 : System.out.println("TUE"); break;
			case 3 : System.out.println("WED"); break;
			case 4 : System.out.println("THU"); break;
			case 5 : System.out.println("FRI"); break;
			case 6 : System.out.println("SAT"); break;
			case 0 : System.out.println("SUN"); break;
			
			}

		}
		//목요일 시작 
		if(month == 2 || month == 3 || month == 11) {
			
			switch(day%7) {
			
			case 5 : System.out.println("MON"); break;
			case 6 : System.out.println("TUE"); break;
			case 0 : System.out.println("WED"); break;
			case 1 : System.out.println("THU"); break;
			case 2 : System.out.println("FRI"); break;
			case 3 : System.out.println("SAT"); break;
			case 4 : System.out.println("SUN"); break;
			
			}

		}
		//일요일 시작
		if(month == 4 || month == 7) {
			
			switch(day%7) {
			
			case 2 : System.out.println("MON"); break;
			case 3 : System.out.println("TUE"); break;
			case 4 : System.out.println("WED"); break;
			case 5 : System.out.println("THU"); break;
			case 6 : System.out.println("FRI"); break;
			case 0 : System.out.println("SAT"); break;
			case 1 : System.out.println("SUN"); break;
			
			}

		}
		
		//화요일 시작
		if(month == 5 ) {
				
			switch(day%7) {
				
			case 0 : System.out.println("MON"); break;
			case 1 : System.out.println("TUE"); break;
			case 2 : System.out.println("WED"); break;
			case 3 : System.out.println("THU"); break;
			case 4 : System.out.println("FRI"); break;
			case 5 : System.out.println("SAT"); break;
			case 6 : System.out.println("SUN"); break;
				
			}

		}		
		
		
		//금요일 시작
		if(month == 6 ) {
						
			switch(day%7) {
						
			case 4 : System.out.println("MON"); break;
			case 5 : System.out.println("TUE"); break;
			case 6 : System.out.println("WED"); break;
			case 0 : System.out.println("THU"); break;
			case 1 : System.out.println("FRI"); break;
			case 2 : System.out.println("SAT"); break;
			case 3 : System.out.println("SUN"); break;
						
			}
		}
		
		//수요일 시작
		if(month == 8 ) {
								
			switch(day%7) {
								
			case 6 : System.out.println("MON"); break;
			case 0 : System.out.println("TUE"); break;
			case 1 : System.out.println("WED"); break;
			case 2 : System.out.println("THU"); break;
			case 3 : System.out.println("FRI"); break;
			case 4 : System.out.println("SAT"); break;
			case 5 : System.out.println("SUN"); break;
								
			}
		}
		
		//토요일 시작
		if(month == 9 || month == 12) {
									
			switch(day%7) {
										
			case 3 : System.out.println("MON"); break;
			case 4 : System.out.println("TUE"); break;
			case 5 : System.out.println("WED"); break;
			case 6 : System.out.println("THU"); break;
			case 0 : System.out.println("FRI"); break;
			case 1 : System.out.println("SAT"); break;
			case 2 : System.out.println("SUN"); break;
										
				}
		}
		
		
	}
}
