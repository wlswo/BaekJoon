package silver.S5_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		
		// 배열로 받은후 HashMap으로 중복제거 
		// 각 인덱스의 value 의 사이즈 별로 정렬 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			if(!list.contains(str)) {
				list.add(str);
			}
		}
		//1.오름 차순으로 정렬 
		list.sort(Comparator.naturalOrder());
		//2.사이즈 별로 다시 정렬 
		list.sort(new SizeComparator());
		
		
		for(String i : list) {
			System.out.println(i);
		}
		
	}
}

//비교문 재정의 
class SizeComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		if(o1.length() > o2.length()) {
			return 1;
		}else if(o1.length() < o2.length()) {
			return -1;
		}
		
		return 0;
	}
}
