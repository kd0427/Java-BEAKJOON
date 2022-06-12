package day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		/*
		 *  문자열은 입력받고
		 *  입력받은 문자열에서 a,e,i,o,u  모음만 출력
		 *  
		 *  모음이 하나도 없으면 ??? 출력
		 *  
		 *  첫째줄 n을 입력받고
		 *  n개만큼 문장을 입력받음
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String result = "";
		
		char ggo[]= new  char[] {'a','e','i','o','u'};
		
		for(int i =0;i<n;i++) {
			
			String a = br.readLine();
			for(int j=0; j<a.length();j++) {
				if(a.charAt(j)==ggo[j]) {
					result+= ggo[j]+"";
				}
			}
			if(result=="") {
				System.out.println("???");
			}else {
				System.out.println(result);
			}
		}
		

		
	}

}
