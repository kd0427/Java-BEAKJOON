package day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1 {

	public static void main(String[] args) throws Exception{
		/*
		 * 2의 제곱수인지 확인하기
		 * 
		 * 첫째줄에 램에 갯수
		 * 두번재줄에 램의 용량
		 * 
		 *  출력
		 *  첫째줄에 고장난 램의 갯수
		 *  둘째줄 고장난 램 번호
		 *  
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt=0;
		int num=1;
		String result="";
		String size = br.readLine();
		
		String ram[] = size.split(" ");
		
		for(String x : ram) {
			int test = Integer.parseInt(x);
			if((test & (test-1))!=0) {
				cnt++;
				result+= num+" ";
			}
			num++;
		}
		
		if(cnt == 0) {
			System.out.println(cnt);
		}else {
			System.out.println(cnt);
			System.out.println(result);
		}
		
	

	}

}
